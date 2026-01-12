package models;

public class Node<T> {
    private T value;
    private int edad;

    

    public Node(T value, int edad) {
        this.value = value;
        this.edad = edad;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + edad;
        return result;
    }

    /* 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (edad != other.edad)
            return false;
        return true;
    }

    */
    

    

   

    
}
