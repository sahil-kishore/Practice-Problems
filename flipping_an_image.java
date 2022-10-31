class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //optimized way
        int row = image.length; // suppose row length =3
        int col = image[0].length; // suppose col length=3
        int[][] res = new int[row][col];
        
        for(int i = 0 ; i<row ; i++){
            for(int j = col-1; j >=0; j--){
                res[i][col-1-j] = image[i][j] ^ 1; // here we have applied XOR to complement so that it can invert 0 to 1 or 1 to 0
            }
        }
       
        return res;
    }
}
