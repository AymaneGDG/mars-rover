package marsroverimpl;

import marsroverimpl.MarsRoverConstants;

public class Rover {

    Integer x = 0;
    Integer y = 0;
    Integer facing = MarsRoverConstants.N;

    public Rover() {
    }

    public void setPosition(Integer x, Integer y, Integer facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    protected void printPosition(){
        char value = 'N';
        if (null != facing)
            switch (facing) {
                case 1:
                    value = 'N';
                    break;
                case 2:
                    value = 'E';
                    break;
                case 3:
                    value = 'S';
                    break;
                case 4:
                    value = 'W';
                    break;
                default:
                    break;
            }
        System.out.println(x + " " + y + " " + value);
    }

    protected void executeCommand(String commands) {
        for (int i = 0; i < commands.length(); i++) {
            executeCommand(commands.charAt(i));
        }
    }

    private void executeCommand(Character command) {
        if (command.equals('L')) {
            turnLeft();
        } else if (command.equals('R')) {
            turnRight();
        } else if (command.equals('M')) {
            move();
        } else {
            throw new IllegalArgumentException(
                    "Undefined move of the river, the exploration will be out of the plateau");
        }
    }

    private void move() {
        if (facing.intValue() ==  MarsRoverConstants.N.intValue() && this.y <= y) {
            y++;
        }
        else if (facing.intValue() ==  MarsRoverConstants.E.intValue() && this.x <= x) {
            x++;
        }
        else if (facing.intValue() ==  MarsRoverConstants.S.intValue() && this.y <= y) {
            y--;
        }
        else if (facing.intValue() ==  MarsRoverConstants.W.intValue() && this.x <= x) {
            x--;
        }
    }

    private void turnLeft() {
        facing = (facing - 1) < MarsRoverConstants.N ? MarsRoverConstants.W : facing - 1;
    }

    private void turnRight() {
        facing = (facing + 1) > MarsRoverConstants.W ? MarsRoverConstants.N : facing + 1;
    }
}