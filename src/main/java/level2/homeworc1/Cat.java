package level2.homeworc1;

public class Cat implements Jumping, Running {
    private String name;
    private int jumpHeight;
    private int runningSpeed;

    public Cat(String name, int jumpHeight, int runningSpeed){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runningSpeed = runningSpeed;
    }
    public Cat(String name){
        this.name = name;
    }

    @Override
    public void jump(){
        System.out.println("Кот по имени - " + name + " подпрыгнул");
    }

    @Override
    public void run(){
        System.out.println("Кот по имени - " + name + " побежал");
    }

    @Override
    public void jumpOverTheWall(){
        if (Wall.h < jumpHeight || Wall.h == jumpHeight){
            System.out.println(name + " Перепрыгнул через стену. Молодец!");
        }else {
            System.out.println(name + "Не допрыгнул. Ест много вискаса");
        }
    }

    @Override
    public void joggingOnTheTrack(){
        if (Treadmill.s < runningSpeed || Treadmill.s == runningSpeed){
            System.out.println(name + " Пробежался по дорожке. Сил хватило");
        }else {
            System.out.println(name + " Скатился с дорожки, сил не хватило");
        }
    }
    @Override
    public String toString() {
        return  name +"   " + jumpHeight + "   " +runningSpeed;
    }

}

