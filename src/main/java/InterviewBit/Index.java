package InterviewBit;

public class Index implements Comparable<Index>{
    private int start;
    private int end;

    public Index(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Index{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public static Index max(Index i1, Index i2, Index i3) {
        if (i1.compareTo(i2)>=0) {
            if (i1.compareTo(i3)>=0) return i1;
            else return i3;
        }
        else if(i2.compareTo(i3)>=0){
            return i2;
        }
        return i3;
    }

    @Override
    public int compareTo(Index o2) {
        if (this.end-this.start==o2.end-o2.start){
            if (this.start<o2.start) return 1;
            else return -1;
        }
        return (this.end-this.start)-(o2.end-o2.start);
    }
}
