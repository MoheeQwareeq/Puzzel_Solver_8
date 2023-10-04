package PuzzelSolver8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Node extends PriorityQueue<Node> implements Comparable<Node> {

    int[][] st = new int[3][3];
    int[][] end_point;
    Node parent = null;
    int posI;
    int posJ;
    int h;
    int cost;
    int fun;

    ArrayList<Node> children = new ArrayList<Node>();

    Node(int start[][], int end[][], int i, int j, int c) {
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                st[k][l] = start[k][l];
            }
        }
        this.cost = c;
        this.posI = i;
        this.posJ = j;
        end_point = end;

    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.fun, o.fun);
    }

    static boolean checkIfmatrixEquel(int m[][], int[][] m1) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] != m1[i][j]) {
                    return false;

                }

            }

        }
        return true;

    }

    void genChildren() {
        if (this.posJ == 0 || this.posJ == 1) {
            //genrate right 
            int[][] tmp = copyArr(st);
            int swap = tmp[posI][posJ];
            tmp[posI][posJ] = tmp[posI][posJ + 1];
            tmp[posI][posJ + 1] = swap;
            children.add(new Node(tmp, end_point, posI, posJ + 1, cost + 1));

        }
        if (this.posJ == 2 || this.posJ == 1) {
            //genrate left 
            int[][] tmp = copyArr(st);
            int swap = tmp[posI][posJ];
            tmp[posI][posJ] = tmp[posI][posJ - 1];
            tmp[posI][posJ - 1] = swap;
            children.add(new Node(tmp, end_point, posI, posJ - 1, cost + 1));

        }
        if (this.posI == 0 || this.posI == 1) {
            //genrate DOWN 
            int[][] tmp = copyArr(st);
            int swap = tmp[posI][posJ];
            tmp[posI][posJ] = tmp[posI + 1][posJ];
            tmp[posI + 1][posJ] = swap;
            children.add(new Node(tmp, end_point, posI + 1, posJ, cost + 1));

        }
        if (this.posI == 1 || this.posI == 2) {
            //genrate UP
            int[][] tmp = copyArr(st);
            int swap = tmp[posI][posJ];
            tmp[posI][posJ] = tmp[posI - 1][posJ];
            tmp[posI - 1][posJ] = swap;
            children.add(new Node(tmp, end_point, posI - 1, posJ, cost + 1));

        }

    }

    int calcH2() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (st[i][j] != end_point[i][j]) {
                    sum++;
                }
            }
        }
        return sum;
    }

    int calcH() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                int firstX = i;
                int firsty = j;
                boolean f = false;
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (st[i][j] == end_point[k][l]) {
                            sum += Math.abs(i - k) + Math.abs(j - l);
                            f = true;
                            break;
                        }
                    }
                    if (f) {
                        break;
                    }
                }
            }

        }
        return sum;
    }

    static Node checkIfExistInPQ(PriorityQueue<Node> list, Node n) {
        Iterator it = list.iterator();
        boolean check = false;
        while (it.hasNext()) {
            Node tmp = (Node) it.next();
            if (checkIfmatrixEquel(tmp.st, n.st)) {
                return tmp;
            }

        }
        return null;

    }

    public static Node solutionAstar(Node s, int whichH) {
        PriorityQueue<Node> closeList = new PriorityQueue<Node>();
        PriorityQueue<Node> openList = new PriorityQueue<Node>();
        if (whichH == 1) {
            s.h = s.calcH();
        } else {
            s.h = s.calcH2();
        }
        s.fun = s.h;

        openList.add(s);
        while (!openList.isEmpty()) {
            Node obj = openList.peek();
            if (obj.h == 0) {
                return obj;
            }
            obj.genChildren();
            for (Node child : obj.children) {
                if (checkIfExistInPQ(openList, child) == null && checkIfExistInPQ(closeList, child) == null) {
                    child.parent = obj;
                    child.cost = obj.cost + 1;
                    if (whichH == 1) {
                        child.h = child.calcH();
                    } else {
                        child.h = child.calcH2();
                    }
                    child.fun = child.cost + child.h;
                    openList.add(child);

                } else {
                    boolean inCloseList = false;
                    Node m = null;
                    m = checkIfExistInPQ(openList, child);
                    if (m == null) {
                        m = checkIfExistInPQ(closeList, child);
                        inCloseList = true;
                    }
                    if (obj.cost + 1 < m.cost) {
                        m.parent = obj;
                        m.cost = obj.cost + 1;
                        m.fun = m.cost + m.h;
                        if (inCloseList) {
                            closeList.remove(m);
                            openList.add(m);
                        }
                    }

                }
            }
            openList.remove(obj);
            closeList.add(obj);
        }

        return s;
    }

    public static Node solutionGready(Node s, int whichH) {
        PriorityQueue<Node> closeList = new PriorityQueue<Node>();
        PriorityQueue<Node> openList = new PriorityQueue<Node>();
        if (whichH == 1) {
            s.h = s.calcH();
        } else {
            s.h = s.calcH2();
        }
        s.fun = s.h;

        openList.add(s);
        while (!openList.isEmpty()) {
            Node obj = openList.peek();
            if (obj.h == 0) {
                return obj;
            }
            obj.genChildren();
            for (Node child : obj.children) {
                if (checkIfExistInPQ(openList, child) == null && checkIfExistInPQ(closeList, child) == null) {
                    child.parent = obj;
//               child.cost=obj.cost+1;
                    if (whichH == 1) {
                        child.h = child.calcH();
                    } else {
                        child.h = child.calcH2();
                    }
                    child.fun = child.h;
                    openList.add(child);

                }

            }
            openList.remove(obj);
            closeList.add(obj);
        }

        return s;
    }

    int[][] copyArr(int a[][]) {
        int[][] tmp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tmp[i][j] = a[i][j];
            }
        }

        return tmp;
    }

}
