package iterator;

// 요소를 하나씩 나열하면서 루프 변수와 같은 역할 수행
public interface Iterator {
    
    public abstract boolean hasNext(); // 다음 요소가 존재하는지 조사
    public abstract Object next(); // 다음 요소를 획득
}
