public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vector sumVector(Vector v1, Vector v2) {
        return new Vector(
            v1.x + v2.x,
            v1.y + v2.y,
            v1.z + v2.z
        );
    }

    public Vector minVector(Vector v1, Vector v2) {
        return new Vector(
            v1.x - v2.x,
            v1.y - v2.y,
            v1.z - v2.z
        );
    }

    public Vector multByNumVector(Vector v, int num) {
        return new Vector (
            v.x * num,
            v.y * num,
            v.z * num
        );
    }

    public int multVector(Vector v1, Vector v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z + v2.z; 
    }

    public Vector multVector(Vector v, int num) {
        return new Vector (
            v.x * num,
            v.y * num,
            v.z * num
        );
    }
}
