/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Damian Nunez
 * @version January 23,2023
 */
public class Picture
{
    private Square sky;
    private Square building;
    private Square building2;
    private Square grass;
    private Square roof;
    private Square roof2;
    private Triangle building3;
    private Triangle mountain;
    private Triangle river;
    private Circle sun;
    private Person human;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        building = new Square();
        building2 = new Square();
        building3 = new Triangle();
        roof = new Square();
        roof2 = new Square();
        grass = new Square();
        mountain = new Triangle();
        river = new Triangle();
        sun = new Circle();
        human = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) 
        {   
            sky.changeColor("sky blue");
            sky.moveHorizontal(-400);
            sky.moveVertical(-120);
            sky.changeSize(600);
            sky.makeVisible();
            
            grass.changeColor("green");
            grass.moveHorizontal(-400);
            grass.moveVertical(50);
            grass.changeSize(600);
            grass.makeVisible();
            
            mountain.changeColor("brown");
            mountain.moveHorizontal(200);
            mountain.moveVertical(-17);
            mountain.changeSize(50,100);
            mountain.makeVisible();
            
            building.changeColor("grey");
            building.moveHorizontal(100);
            building.moveVertical(30);
            building.changeSize(25);
            building.makeVisible();
            
            building2.changeColor("grey");
            building2.moveHorizontal(70);
            building2.moveVertical(40);
            building2.changeSize(25);
            building2.makeVisible();
            
            building3.changeColor("grey");
            building3.moveHorizontal(70);
            building3.moveVertical(0);
            building3.changeSize(50,10);
            building3.makeVisible();
            
            roof.changeColor("grey");
            roof.moveHorizontal(-30);
            roof.moveVertical(33);
            roof.changeSize(10);
            roof.makeVisible();
            
            roof2.changeColor("grey");
            roof2.moveHorizontal(-38);
            roof2.moveVertical(33);
            roof2.changeSize(10);
            roof2.makeVisible();
            
            river.changeColor("blue");
            river.moveHorizontal(-100);
            river.moveVertical(30);
            river.changeSize(500,200);
            river.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(160);
            sun.moveVertical(-40);
            sun.changeSize(40);
            sun.makeVisible();
            
            human.changeColor("purple");
            human.moveHorizontal(160);
            human.moveVertical(10);
            human.changeSize(10,10);
            human.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        grass.changeColor("grey");
        mountain.changeColor("grey");
        sun.changeColor("black");
        human.changeColor("white");
        building.changeColor("black");
        building2.changeColor("black");
        building3.changeColor("black");
        roof.changeColor("black");
        roof2.changeColor("black");
        river.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("sky blue");
        grass.changeColor("green");
        mountain.changeColor("brown");
        sun.changeColor("yellow");
        human.changeColor("black");
        building.changeColor("grey");
        building2.changeColor("grey");
        building3.changeColor("grey");
        roof.changeColor("grey");
        roof2.changeColor("grey");
        river.changeColor("blue");
    }
}
