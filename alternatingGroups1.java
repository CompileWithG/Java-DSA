class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        //circular increment
        int count=0;
        int s=0;
        int e=s+2;
        if(colors.length==1 || colors.length==2)
            return 0;
        if(colors[s]==colors[e]&&colors[s]!=colors[s+1]){
            count++;
        }
        s=(s+1)%colors.length;
        e=(e+1)%colors.length;
        while(s!=0){
            if(colors[s]==colors[e]&&colors[s]!=colors[(s+1)%colors.length]){
            count++;
        }
        s=(s+1)%colors.length;
        e=(e+1)%colors.length;
        }
        return count;
    }
}
/*There is a circle of red and blue tiles. You are given an array of integers colors. The color of tile i is represented by colors[i]:

colors[i] == 0 means that tile i is red.
colors[i] == 1 means that tile i is blue.
Every 3 contiguous tiles in the circle with alternating colors (the middle tile has a different color from its left and right tiles) is called an alternating group.

Return the number of alternating groups.

Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.

 

Example 1:

Input: colors = [1,1,1]

Output: 0 */