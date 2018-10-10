public class Cat extends Animal {

    double runbreakPoint;
    double jumpbreakPoint;

    public Cat(){
        runbreakPoint = 200;
        jumpbreakPoint = 2;
    }

    public Cat(double runbreakPoint, double jumpbreakPoint){
        this.runbreakPoint = runbreakPoint;
        this.jumpbreakPoint = jumpbreakPoint;
    }

    @Override
    public String Run(double distance){
        boolean result = false;
        if (distance < runbreakPoint){
            result = true;
            return "кот пробежал " + distance + " метров: " + result;
        }
        return "кот не может бежать больше " + runbreakPoint + " метров: " + result;
    }

    @Override
    public String Jump(double height){
        boolean result = false;
        if (height < jumpbreakPoint){
            result = true;
            return "кот прыгнул на " + height + " метров: " + result;
        }
        return "кот не может прыгнуть выше " + jumpbreakPoint + " метров: " + result;
    }

    public String Swim(){
        boolean result = false;
        return "кот не умеет плавать: " + result;
    }

}