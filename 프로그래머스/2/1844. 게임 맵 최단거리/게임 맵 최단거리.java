import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        int m = maps.length;
        int n = maps[0].length;
        
        int[][] mazePath = new int[m+2][n+2];
        int [][] mark = new int [m+2][n+2];
        
        int [][] move = {{0,-1},{1,0},{0,1},{-1,0}};
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++ ) {
                mazePath[i+1][j+1] = maps[i][j];
                mark[i+1][j+1] = maps[i][j];
            }
        }
        
        Queue <int[]> queue = new LinkedList<>();
        queue.add(new int[] {1,1});
        mark[1][1] = 0;
        
        while(! queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
        
            if(x == m && y == n) {
                answer = mazePath[x][y];
                return answer;
            }
                
            for(int k = 0; k <4; k++) {
                int nextX = x + move[k][0];
                int nextY = y + move[k][1];
            
                if(mazePath[nextX][nextY] == 1 && mark[nextX][nextY] == 1) {
                    queue.add(new int[] {nextX,nextY});
                    mark[nextX][nextY] = 0;
                    mazePath[nextX][nextY] = mazePath[x][y] + 1;
                }
            }
        }
        
        answer = -1;
        return answer;                
    }
}

