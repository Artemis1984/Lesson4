public class Dog extends Animal {

    double runbreakPoint;
    double jumpbreakPoint;
    double swimbreakPoint;

    public Dog(){
        runbreakPoint = 500;
        jumpbreakPoint = 0.5;
        swimbreakPoint = 10;
    }

    public Dog(double runbreakPoint, double swimbreakPoint, double jumpbreakPoint){

        this.runbreakPoint = runbreakPoint;
        this.swimbreakPoint = swimbreakPoint;
        this.jumpbreakPoint = jumpbreakPoint;
    }

    @Override
    public String Run(double distance){
        boolean result = false;
        if (distance < runbreakPoint){
            result = true;
            return "собака пробежала "+ distance + " метров: " + result;
        }
        return "собака не может бежать больше "+ runbreakPoint + " метров: " + result;
    }

    @Override
    public String Jump(double height){
        boolean result = false;
        if (height < jumpbreakPoint){
            result = true;
            return "собака прыгнула на "+ height + " метров: " + result;
        }
        return "собака не может прыгать выше "+ jumpbreakPoint + " метров: " + result;
    }

    public String Swim(double distance){
        boolean result = false;
        if (distance < swimbreakPoint){
            result = true;
            return "собака заплыла "+ distance + " метров: " + result;
        }
        return "собака не может плыть больше "+ swimbreakPoint + " метров: " + result;
    }

}