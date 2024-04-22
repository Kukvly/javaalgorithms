package tested;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class hyodo {

    public static final int AVAILABLE_NUMBER_OF_VISITED_POINT = 4;
    public static final int DIRECT_NUMBER = 4;
    public static int[] dx = new int[]{0, 0, -1, 1};
    public static int[] dy = new int[]{-1, 1, 0, 0};
    public static int[][] board;
    public static int N, M;
    public static Point[] friendPoints;
    public static List<Point> visitedPoints = new ArrayList<>();
    public static List<List<Route>> friendsRoutes = new ArrayList<>();
    public static List<Integer> result = new ArrayList<>();

    static class  Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean isSame(Point point) {
            if (this.x == point.x && this.y == point.y) {
                return true;
            }
            return false;
        }
    }

    static class Route {
        Point[] points;

        public Route(List<Point> points) {
            this.points = points.toArray(new Point[4]);
        }
    }

    public static void main(String[] args) throws Exception {
        setUp();
        findAllFriendRoutes();

        for (int i = 0; i < M; i++) {
            findRouteCombination(i, friendsRoutes.get(i));
        }

        System.out.println(Collections.max(result));
    }

    public static void setUp() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][N];
        friendPoints = new Point[M];

        for (int row = 0; row < N; row++) {
            st = new StringTokenizer(br.readLine());
            for (int col = 0; col < N; col++) {
                int a = Integer.parseInt(st.nextToken());
                board[row][col] = a;
            }
        }

        for (int i = 0; i < M; i++) {
            friendsRoutes.add(new ArrayList<>());
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            friendPoints[i] = new Point(x, y);
        }
    }

    public static void findRouteCombination(int friendIndex, List<Route> routes) {
        if (friendIndex == M) {
            result.add(getTotalFruits(routes));
            return;
        }

        for (Route route : friendsRoutes.get(friendIndex)) {
            routes.add(route);
            findRouteCombination(friendIndex + 1, routes);
            routes.remove(routes.size() - 1);
        }
    }

    public static int getTotalFruits(List<Route> routes) {
        int result = 0;
        int[][] copyBoard = new int[N][];

        for (int i = 0; i < N; i++) {
            copyBoard[i] = board[i].clone();
        }
        for (Route route : routes) {
            for (Point point : route.points) {
                result += copyBoard[point.y][point.x];
                copyBoard[point.y][point.x] = 0;
            }
        }
        return result;
    }

    public static void findAllFriendRoutes() {
        for (int i = 0; i < friendPoints.length; i++) {
            visitedPoints.add(friendPoints[i]);
            findEachFriendRoutes(visitedPoints, i, friendPoints[i]);
            visitedPoints.clear();
        }
    }

    public static void findEachFriendRoutes(List<Point> visitedPoints, int idx, Point currentPoint) {
        if (visitedPoints.size() == AVAILABLE_NUMBER_OF_VISITED_POINT) {
            friendsRoutes.get(idx).add(new Route(visitedPoints));
            return;
        }

        for (int i = 0; i < DIRECT_NUMBER; i++) {
            int nx = currentPoint.x + dx[i];
            int ny = currentPoint.y + dy[i];
            if (0 <= nx && nx < N && 0 <= ny && ny < N) {
                Point newPoint = new Point(nx, ny);
                if (!isVisited(visitedPoints, newPoint)) {
                    visitedPoints.add(newPoint);
                    findEachFriendRoutes(visitedPoints, idx, newPoint);
                    visitedPoints.remove(visitedPoints.size() - 1);
                }
            }
        }
    }

    public static boolean isVisited(List<Point> visitedPoints, Point point) {
        for (Point visitedPoint : visitedPoints) {
            if (point.isSame(visitedPoint)) {
                return true;
            }
        }
        return false;
    }

}