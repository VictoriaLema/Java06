package HW7_Objects;

public class Block {
    int width;
    int length;
    int height;


    public Block ( int[] sides) {
        sides[0] = width;
        sides[1] = length;
        sides[2] = height;

    }

    int getWidth() {

        return width;
    }

    int getLength() {

        return  length;
    }

    int getHeight() {

        return  height;
    }

    int getVolume() {

        return width * length * height;
    }

    int getSurfaceArea() {

        return 2 * (width * length + length * height + height * width);
    }
}
