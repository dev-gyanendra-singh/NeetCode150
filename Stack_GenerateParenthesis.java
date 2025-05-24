public class Stack_GenerateParenthesis {
    public static void main(String[] args) {
        Stack_GenerateParenthesis main = new Stack_GenerateParenthesis();
        System.out.println(main.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result, "", 0, 0, n);
        return result;
    }

    private void backTrack(List<String> result, String validParenthesi, int open, int close, int n) {
        if(validParenthesi.length() == 2*n) {
            result.add(validParenthesi);
            return;
        }

        if(open < n) {
            backTrack(result, validParenthesi + '(', open+1, close, n);
        }

        if(close < open) {
            backTrack(result, validParenthesi + ')', open, close +1, n);
        }
    }
}
