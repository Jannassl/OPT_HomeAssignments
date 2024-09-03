public class ArrayEquality {

    public int[] getSingleDimensionalArray() {
        return new int[]{2, 3, 5, 7};
    }

    public int[][] getMultiDimensionalArray() {
        return new int[][]{{2, 3}, {5, 7}, {11, 13}};
    }

    public boolean areSingleDimensionalArraysEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean areMultiDimensionalArraysEqual(int[][] a, int[][] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (!areSingleDimensionalArraysEqual(a[i], b[i])) {
                return false;
            }
        }
        return true;
    }
}