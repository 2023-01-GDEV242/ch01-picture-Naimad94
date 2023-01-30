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
    private Square building;
    private Square window;
    private Triangle mountain;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        building = new Square();
        window = new Square();
        mountain = new Triangle();  
        sun = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) 
        {
            building.moveHorizontal(-140);
            building.moveVertical(20);
            building.changeSize(120);
            building.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            mountain.changeSize(60, 180);
            mountain.moveHorizontal(20);
            mountain.moveVertical(-60);
            mountain.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        building.changeColor("black");
        window.changeColor("white");
        mountain.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        building.changeColor("red");
        window.changeColor("black");
        mountain.changeColor("green");
        sun.changeColor("yellow");
    }
}
