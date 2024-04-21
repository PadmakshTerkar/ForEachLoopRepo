interface printable
{
    void print();

}
class InterfaceExample implements printable
{
    public void print()
    {
        System.out.print("Print Hello");
    }
    public static void main(String args[])
    {
        InterfaceExample object =new InterfaceExample();
        object.print();
    }
}