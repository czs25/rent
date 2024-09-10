//任务一 崔子硕 2022015459 2023.11.7
#include<stdio.h>
#include<stdlib.h>
typedef struct {
    int* data;          
    int* a;          
    int rows;           
    int cols;          
    int n;            
} Stu;

void initStu(Stu* matrix, int rows, int cols) {
    matrix->rows = rows;
    matrix->cols = cols;
    matrix->n = 0;

    matrix->data = (int*)malloc(rows * cols* sizeof(int));
    matrix->a = (int*)malloc(rows*sizeof(int));

    for (int i = 0; i < rows; i++) {
        matrix->a[i] = -1;
    }
}

void addElement(Stu* matrix, int row, int col, int m) {


    if (row < 0 || row >= matrix->rows || col < 0 || col >= matrix->cols) {
        printf("错误\n");
        return;
    }

    if (m == 0) {
        printf("错误");
        return;
    }

    matrix->data[matrix->n] = m;

    if (matrix->a[row] == -1 || matrix->data[matrix->a[row]] > col) {
        matrix->a[row] = matrix->n;
    }

    matrix->n++;
}

int getElement(Stu matrix, int row, int col) {
    if (row < 0 || row >= matrix.rows || col < 0 || col >= matrix.cols) {
        printf("错误\n");
        return 0;
    }

    int start = matrix.a[row];
    int end = matrix.n;

    if (row + 1 < matrix.rows) {
        end = matrix.a[row + 1];
    }

    for (int i = start; i < end; i++) {
        int index = i - start;
        int current = index % matrix.cols;

        if (current == col) {
            return matrix.data[i];
        }
    }

    return 0;
}

