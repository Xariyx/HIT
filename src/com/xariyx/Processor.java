package com.xariyx;

import java.util.Scanner;

public class Processor {

    public Processor() {
        Scanner scanner = new Scanner(System.in);
        Thread process = new Thread(() -> {
            while(true) {
                String input = scanner.nextLine().toUpperCase();
                String output = getHitString(input);
                System.out.println(output);
            }

        });
        process.start();


    }

    private static String getHitString(String input) {
        StringBuilder sb = new StringBuilder();
        for (char aChar : input.toCharArray()) {
            sb.append(getHitCharFromChar(aChar)).append(" ");
        }
        return sb.toString();
    }

    private static String getHitCharFromChar(char aChar) {

        switch (aChar) {
            case 'A':
            case 'Ą': {
                return HitChar.A;
            }
            case 'B': {
                return HitChar.B;
            }
            case 'C':
            case 'Ć': {
                return HitChar.C;
            }
            case 'D': {
                return HitChar.D;
            }
            case 'E':
            case 'Ę': {
                return HitChar.E;
            }
            case 'F': {
                return HitChar.F;
            }
            case 'G': {
                return HitChar.G;
            }
            case 'H': {
                return HitChar.H;
            }
            case 'I': {
                return HitChar.I;
            }
            case 'J': {
                return HitChar.J;
            }
            case 'K': {
                return HitChar.K;
            }
            case 'L':
            case 'Ł': {
                return HitChar.L;
            }
            case 'M': {
                return HitChar.M;
            }
            case 'N':
            case 'Ń': {
                return HitChar.N;
            }
            case 'O':
            case 'Ó': {
                return HitChar.O;
            }
            case 'P': {
                return HitChar.P;
            }
            case 'R': {
                return HitChar.R;
            }
            case 'S':
            case 'Ś': {
                return HitChar.S;
            }
            case 'T': {
                return HitChar.T;
            }
            case 'U': {
                return HitChar.U;
            }
            case 'V': {
                return HitChar.V;
            }
            case 'W': {
                return HitChar.W;
            }
            case 'X': {
                return HitChar.X;
            }
            case 'Y': {
                return HitChar.Y;
            }
            case 'Z':
            case 'Ż':
            case 'Ź': {
                return HitChar.Z;
            }

            case '0': {
                return HitChar.NUM0;
            }
            case '1': {
                return HitChar.NUM1;
            }
            case '2': {
                return HitChar.NUM2;
            }
            case '3': {
                return HitChar.NUM3;
            }
            case '4': {
                return HitChar.NUM4;
            }
            case '5': {
                return HitChar.NUM5;
            }
            case '6': {
                return HitChar.NUM6;
            }
            case '7': {
                return HitChar.NUM7;
            }
            case '8': {
                return HitChar.NUM8;
            }
            case '9': {
                return HitChar.NUM9;
            }

            default: {
                return HitChar.ERROR;
            }

        }

    }
}
