package zhuangshi;

public class Function implements Phone {

    private Phone phone;

    public Function(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }
}
