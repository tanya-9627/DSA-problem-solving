class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>  result = new ArrayList<>();
    backtrack(result,"",0,0,n);
    return result;
    }
    private  void backtrack(List<String>result, String curront, int open,  int close,int max){
        if(curront.length()==max*2){
            result.add(curront);
            return;
        }
        if(open<max){
            backtrack(result,curront+"(",open+1,close,max);
        }
         if(close<open){
            backtrack(result,curront+")",open,close+1,max);
        }
    }

  
}