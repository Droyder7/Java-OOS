class stack
{
    private int arr[],size,top=0;

    public  stack( int x) {
        size = x;
        arr = new int[size];
    }

    public void push(int x)
    {
        arr[top++] = x;
    }

    public int pop()
    {
        int x = arr[top--];
        return x;
    }

    public void print() {

        
        System.out.println("Stack :");

        for (int i = top-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        stack st = new stack(30);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(15);
        st.push(9);

        st.print();

        st.pop();
        st.pop();
        st.pop();
        
        st.print();

    }
}