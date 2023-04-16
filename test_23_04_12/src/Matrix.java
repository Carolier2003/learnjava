public class Matrix {
    private double[][] data; //定义一个二维数组类型的属性data

    public Matrix(double[][] data) { //定义一个构造方法，接收一个二维数组类型的参数
        this.data = data; //给data属性赋值
    }

    public String toString() { //定义一个toString方法，返回矩阵的字符串表示
        StringBuilder sb = new StringBuilder(); //创建一个StringBuilder对象用于拼接字符串
        sb.append("[\n"); //在每一行的开头添加一个方括号
        for (int i = 0; i < data.length; i++) { //遍历矩阵的每一行
            sb.append("["); //在每一行的开头添加一个方括号
            for (int j = 0; j < data[i].length; j++) { //遍历矩阵的每一列
                sb.append(String.format("%.3f ", data[i][j]));
            }
            sb.append("]\n"); //在每一行的结尾添加一个方括号和换行符
        }
        sb.append("]\n"); //在每一行的结尾添加一个方括号和换行符
        return sb.toString(); //返回StringBuilder对象的字符串表示
    }

    public Matrix multiply(Matrix other) { //定义一个multiply方法，接收另一个Matrix对象作为参数，返回两个矩阵相乘的结果
        if (this.data[0].length != other.data.length) { //如果两个矩阵不能相乘，抛出异常
            throw new IllegalArgumentException("The matrices cannot be multiplied.");
        }
        int m = this.data.length; //获取第一个矩阵的行数
        int n = other.data[0].length; //获取第二个矩阵的列数
        int p = this.data[0].length; //获取第一个矩阵的列数或第二个矩阵的行数
        double[][] result = new double[m][n]; //创建一个新的二维数组用于存储结果
        for (int i = 0; i < m; i++) { //遍历结果矩阵的每一行
            for (int j = 0; j < n; j++) { //遍历结果矩阵的每一列
                double sum = 0; //初始化一个变量用于存储累加和
                for (int k = 0; k < p; k++) { //遍历第一个矩阵的列数或第二个矩阵的行数
                    sum += this.data[i][k] * other.data[k][j]; //将两个矩阵对应位置的元素相乘并累加到sum中
                }
                result[i][j] = sum; //将sum赋值给结果矩阵对应位置的元素
            }
        }
        return new Matrix(result); //返回结果矩阵的Matrix对象表示
    }
}