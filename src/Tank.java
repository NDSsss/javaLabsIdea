public class Tank {
    private double[] dist;
    int pos = 0;

    public void setDist(double[] dist) {
        this.dist = dist;
    }

    public Tank(double[] dist) {
        this.dist = dist;
        sort();
    }

    private void sort() {
        int temp;
        for (int i = dist.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (dist[j] < dist[j + 1]) {
                    double tmp = dist[j];
                    dist[j] = dist[j + 1];
                    dist[j + 1] = tmp;
                }
            }
        }
    }

    public int enemies(){
        return dist.length+1;
    }

    public String kill() {
        if (pos < dist.length) {
            return String.valueOf(dist[pos++]);
        } else {
            return "Победа";
        }
    }
}
