class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if(n*m!=r*c) return mat;
        int arr[] =new int [n*m];
        int v=0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[v++]=mat[i][j];
            }
        }
        int[][] res=new int[r][c];
        v=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res[i][j]=arr[v++];
            }
        }
        return res;




  // without copying to 1 d array

//       class Solution {
//     public int[][] matrixReshape(int[][] a, int r, int c) {
//         int n=a.length;
//         int m=a[0].length;
//         if(n*m !=r*c) return a;
//         int b[][]= new int[r][c];
//         int d=0;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 b[d/c][d%c]=a[i][j];
//                 d++;
//             }
//         }
//         return b;
//     }
// }
    }
}
