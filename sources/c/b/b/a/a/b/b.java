package c.b.b.a.a.b;

public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
