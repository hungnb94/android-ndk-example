long computeFibonacci(int n) {
    if (n <= 1) {
        return n;
    }
    int f0;
    int f1 = 1;
    int fn = 1;

    for (int i = 2; i < n; i++) {
        f0 = f1;
        f1 = fn;
        fn = f0 + f1;
    }
    return fn;
}