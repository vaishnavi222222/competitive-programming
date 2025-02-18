class Pass_by_reference {
    static int[] passedBy(int a, int b) {
        a = a+1;
        b = b+2;
        int ar[] = {a,b};
        return ar;
    }
}
