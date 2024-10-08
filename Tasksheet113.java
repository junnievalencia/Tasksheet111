class PrimitivesConcat {

    public static void main(String[] args) {

        // Define primitives
        byte zero = 0;         // byte
        short one = 1;         // short
        int three = 3;         // int
        float twoPointZero = 2.0f;  // float
        boolean isTrue = true; // boolean

        // Concatenate the values to form the desired output
        String output = "H" + three + one + one + zero + " w" + zero + "r" + one + "d " + twoPointZero + " " + isTrue;

        // Print the result
        System.out.println(output);
    }
}

