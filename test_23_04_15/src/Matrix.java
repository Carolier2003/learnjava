//定义一个Matrix类，表示一个矩阵
public class Matrix {
    //定义一个二维数组，用来存储矩阵的元素
    public double[][] data;
    //定义一个构造方法，用来创建一个指定行列数的矩阵，并初始化为0
    public Matrix(int rowCount, int colCount) {
        data = new double[rowCount][colCount];
        for(int i = 0; i < rowCount; i++) {
            for(int j = 0; j < colCount; j++) {
                data[i][j] = 0;
            }
        }
    }
    //定义一个方法，用来获取矩阵的行数
    public int getRowCount() {
        return data.length;
    }
    //定义一个方法，用来获取矩阵的列数
    public int getColCount() {
        return data[0].length;
    }
    //定义一个方法，用来将矩阵转换为字符串，方便输出
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < getRowCount(); i++) {
            if(i != 0) {
                sb.append(" ");
            }
            sb.append("[");
            for(int j = 0; j < getColCount(); j++) {
                sb.append(String.format("%.2f", data[i][j]));
                if(j != getColCount() - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
            if(i != getRowCount() - 1) {
                sb.append(",\n");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    //定义一个方法，用来实现矩阵与另一个矩阵相加，返回一个新的矩阵
    public Matrix plus(Matrix other) {
        //判断两个矩阵是否有相同的行列数，如果不同，则抛出异常
        if(getRowCount() != other.getRowCount() || getColCount() != other.getColCount()) {
            throw new IllegalArgumentException("两个矩阵的行列数不相等，无法相加");
        }
        //创建一个新的矩阵，用来存储相加的结果
        Matrix result = new Matrix(getRowCount(), getColCount());
        //遍历两个矩阵的元素，逐个相加，并赋值给新矩阵
        for(int i = 0; i < getRowCount(); i++) {
            for(int j = 0; j < getColCount(); j++) {
                result.data[i][j] = data[i][j] + other.data[i][j];
            }
        }
        //返回新矩阵
        return result;
    }
    //定义一个方法，用来实现矩阵与一个数相加，返回一个新的矩阵
    public Matrix plus(double num) {
        //创建一个新的矩阵，用来存储相加的结果
        Matrix result = new Matrix(getRowCount(), getColCount());
        //遍历矩阵的元素，逐个与数相加，并赋值给新矩阵
        for(int i = 0; i < getRowCount(); i++) {
            for(int j = 0; j < getColCount(); j++) {
                result.data[i][j] = data[i][j] + num;
            }
        }
        //返回新矩阵
        return result;
    }
    //定义一个方法，用来实现矩阵与另一个矩阵相乘，返回一个新的矩阵
    public Matrix multiply(Matrix other) {
        //判断两个矩阵是否满足相乘的条件，即第一个矩阵的列数等于第二个矩阵的行数，如果不满足，则抛出异常
        if(getColCount() != other.getRowCount()) {
            throw new IllegalArgumentException("两个矩阵不满足相乘的条件，无法相乘");
        }
        //创建一个新的矩阵，用来存储相乘的结果，其行数等于第一个矩阵的行数，其列数等于第二个矩阵的列数
        Matrix result = new Matrix(getRowCount(), other.getColCount());
        //遍历新矩阵的元素，根据矩阵乘法的规则，计算每个元素的值，并赋值给新矩阵
        for(int i = 0; i < result.getRowCount(); i++) {
            for(int j = 0; j < result.getColCount(); j++) {
                //计算新矩阵的第i行第j列的元素的值，即第一个矩阵的第i行与第二个矩阵的第j列的点积
                double sum = 0;
                for(int k = 0; k < getColCount(); k++) {
                    sum += data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        //返回新矩阵
        return result;
    }
    //定义一个方法，用来实现矩阵与一个数相乘，返回一个新的矩阵
    public Matrix multiply(double num) {
        //创建一个新的矩阵，用来存储相乘的结果
        Matrix result = new Matrix(getRowCount(), getColCount());
        //遍历矩阵的元素，逐个与数相乘，并赋值给新矩阵
        for(int i = 0; i < getRowCount(); i++) {
            for(int j = 0; j < getColCount(); j++) {
                result.data[i][j] = data[i][j] * num;
            }
        }
        //返回新矩阵
        return result;
    }
    //定义一个方法，用来实现矩阵的转置，返回一个新的矩阵
    public Matrix transpose() {
        //创建一个新的矩阵，用来存储转置的结果，其行数等于原矩阵的列数，其列数等于原矩阵的行数
        Matrix result = new Matrix(getColCount(), getRowCount());
        //遍历原矩阵的元素，将其赋值给新矩阵对应位置上的元素，即原矩阵的第i行第j列的元素赋值给新矩阵的第j行第i列的元素
        for(int i = 0; i < getRowCount(); i++) {
            for(int j = 0; j < getColCount(); j++) {
                result.data[j][i] = data[i][j];
            }
        }
        //返回新矩阵
        return result;
    }
}