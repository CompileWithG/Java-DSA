/*You are given two integers red and blue representing the count of red and blue colored balls. You have to arrange these balls to form a triangle such that the 1st row will have 1 ball, the 2nd row will have 2 balls, the 3rd row will have 3 balls, and so on.

All the balls in a particular row should be the same color, and adjacent rows should have different colors.

Return the maximum height of the triangle that can be achieved.

 

Example 1:

Input: red = 2, blue = 4

Output: 3


*/
class Solution {
    public int maxHeight(int red, int blue) {
        int pick=1;
        int height=0;
        boolean maxFlag=false;
        while(true){
            if(maxFlag){
                if(red==0||red<pick)
                    break;
                red=red-pick;
                pick++;
                height++;
                maxFlag=false;
            }
            else{
                if(blue==0||blue<pick)
                    break;
                blue=blue-pick;
                pick++;
                height++;
                maxFlag=true;
            }
        }
        return height;
    }
    public int maxHeightOfTriangle(int red,int blue){
        int x=maxHeight(red,blue);
        int y=maxHeight(blue,red);
        return x>y?x:y;
    }
}