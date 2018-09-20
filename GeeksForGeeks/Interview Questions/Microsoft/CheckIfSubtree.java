class CheckIfSubtree {
    public static boolean isSubtree(Tree T, Tree S) {
        
        if (T == null) {
            return false;
        }
        
        if (isSame(T, S)) {
            return true;
        } 
        
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
    
    private static boolean isSame(Tree T, Tree S) {
        if (T == null && S == null) {
            return true;
        }
        
        if ((T == null && S != null) || (T != null && S == null)) {
            return false;
        }
        
        if (T.data != S.data) {
            return false;
        }
        
        return isSame(T.left, S.left) && isSame(T.right, S.right);
    }
}
