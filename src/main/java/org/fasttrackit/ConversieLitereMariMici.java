package org.fasttrackit;

import java.util.HashMap;
import java.util.Scanner;

public class ConversieLitereMariMici {

    private static String changeSentenceFirstChoice(String sentence) {
        //stringul este transformat din litera mare in litera mica si invers caracter cu caracter
        int i = 0;
        int j;
        String newSentence = "";

        while (i < sentence.length()) {
            if (sentence.charAt(i) <= (int) 'z' && sentence.charAt(i) >= 'a')
                newSentence = newSentence + (char) ((int) sentence.charAt(i) - 32);

            else if (sentence.charAt(i) <= (int) 'Z' && sentence.charAt(i) >= 'A')
                newSentence = newSentence + (char) ((int) sentence.charAt(i) + 32);

            else if (sentence.charAt(i) == ' ')
                newSentence = newSentence + " ";//spatiul adaugat poate fi de tip string sau caracter

            else if (sentence.charAt(i) == '\t')
                newSentence = newSentence + "   ";

            else if (sentence.charAt(i) == '-')
                newSentence = newSentence + "-";//semnul '-' poate fi de tip string sau caracter

            else if (sentence.charAt(i) == '\'')
                newSentence = newSentence + "'";// apostroful adaugat poate fi numai de tip string

            else if (sentence.charAt(i) == ',')
                newSentence = newSentence + ",";

            else if (sentence.charAt(i) == ':')
                newSentence = newSentence + ":";

            else if (sentence.charAt(i) == '?')
                newSentence = newSentence + "?";

            else if (sentence.charAt(i) == '!')
                newSentence = newSentence + "!";

            else if (sentence.charAt(i) == '.')
                newSentence = newSentence + '.';

            for(j=48;j<58;j++)//pentru cifre
            {
                if(sentence.charAt(i)==(char)j){
                    newSentence = newSentence + (char)j;
                }
            }

            i++;
        }
        System.out.println("Propozitia (first choice) este " + newSentence);
        return newSentence;
    }

    private static StringBuilder changeSentenceSecondChoice(String sentence) {
        //stringul este transformat, caracter cu carcater din litera mare in litera mica si invers,
        //iar intr-un alt obiect string se ataseaza caracter cu caracter, dar transformat, stringul initial
        StringBuilder sentenceString = new StringBuilder(sentence);
        StringBuilder nouString = new StringBuilder();

        int i = 0;
        int j;
        while (i < sentenceString.length()) {
            if (sentenceString.charAt(i) <= (int) 'z' && sentenceString.charAt(i) >= (int) 'a')
                nouString.append((char) ((int) sentenceString.charAt(i) - 32));

            else if (sentenceString.charAt(i) <= (int) 'Z' && sentenceString.charAt(i) >= (int) 'A')
                nouString.append((char) ((int) sentenceString.charAt(i) + 32));

            else if (sentenceString.charAt(i) == ' ')
                nouString.append(" ");

            else if (sentence.charAt(i) == '\t')
                nouString.append("   ");

            else if (sentence.charAt(i) == '-')
                nouString.append("-");//semnul '-' poate fi de tip string sau caracter

            else if (sentence.charAt(i) == '\'')
                nouString.append("'");//apostroful adaugat poate fi numai de tip string

            else if (sentence.charAt(i) == ',')
                nouString.append(",");

            else if (sentence.charAt(i) == ':')
                nouString.append(":");

            else if (sentence.charAt(i) == '?')
                nouString.append("?");

            else if (sentence.charAt(i) == '!')
                nouString.append("!");

            else if (sentence.charAt(i) == '.')
                nouString.append('.');

            for(j=48;j<58;j++)//pentru cifre
            {
                if(sentence.charAt(i)==(char)j){
                    nouString.append((char)j);
                }
            }

            i++;
        }
        System.out.println("Propozitia (second choice) este " + nouString);
        return nouString;
    }

    private static StringBuilder changeSentenceThirdChoice(String sentence) {
        StringBuilder nouString = new StringBuilder();
        int i = 0;
        int j;
        while (i < sentence.length()) {
            if (sentence.codePointAt(i) <= 90 && sentence.codePointAt(i) >= 65)//litera mare
                nouString = nouString.append((char) ((int) sentence.charAt(i) + 32));

            else if (sentence.codePointAt(i) <= 122 && sentence.codePointAt(i) >= 97)//litera mica
                nouString = nouString.append((char) ((int) sentence.charAt(i) - 32));

            else if (sentence.codePointAt(i) == 32)//spatiu
                nouString = nouString.append((char) 32);

            else if (sentence.codePointAt(i) == 9)//tab orizontal
                nouString = nouString.append((char) 9);

            else if (sentence.codePointAt(i) == 45)//minus (cratima)
                nouString = nouString.append((char) 45);

            else if (sentence.codePointAt(i) == 39)//apostrof
                nouString = nouString.append((char) 39);

            else if (sentence.codePointAt(i) == 44)//virgula
                nouString = nouString.append((char) 44);

            else if (sentence.codePointAt(i) == 58)// :
                nouString = nouString.append((char) 58);

            else if (sentence.codePointAt(i) == 63)//semnul intrebarii
                nouString = nouString.append((char) 63);

            else if (sentence.codePointAt(i) == 33)//semnul exclamarii
                nouString = nouString.append((char) 33);

            else if (sentence.codePointAt(i) == 46)//punct
                nouString = nouString.append((char) 46);

            for(j=48;j<58;j++) {//pentru cifre
                if (sentence.codePointAt(i) == j)
                    nouString = nouString.append((char)j);
            }
            i++;
        }
        System.out.println("Propozitia (third choice) este " + nouString);
        return nouString;
    }

    private static StringBuffer changeSentenceFourthChoice(String sentence)
    {
        StringBuffer nouString=new StringBuffer();
        int i,j;
        for(i=0;i<sentence.length();i++)
        {
            if (sentence.codePointAt(i) <= 90 && sentence.codePointAt(i) >= 65)//litera mare
                nouString = nouString.append((char) ((int) sentence.charAt(i) + 32));

            else if (sentence.codePointAt(i) <= 122 && sentence.codePointAt(i) >= 97)//litera mica
                nouString = nouString.append((char) ((int) sentence.charAt(i) - 32));

            else if (sentence.codePointAt(i) == 32)//spatiu
                nouString = nouString.append((char) 32);

            else if (sentence.codePointAt(i) == 9)//tab orizontal
                nouString = nouString.append((char) 9);

            else if (sentence.codePointAt(i) == 45)//minus (cratima)
                nouString = nouString.append((char) 45);

            else if (sentence.codePointAt(i) == 39)//apostrof
                nouString = nouString.append((char) 39);

            else if (sentence.codePointAt(i) == 44)//virgula
                nouString = nouString.append((char) 44);

            else if (sentence.codePointAt(i) == 58)// :
                nouString = nouString.append((char) 58);

            else if (sentence.codePointAt(i) == 63)//semnul intrebarii
                nouString = nouString.append((char) 63);

            else if (sentence.codePointAt(i) == 33)//semnul exclamarii
                nouString = nouString.append((char) 33);

            else if (sentence.codePointAt(i) == 46)//punct
                nouString = nouString.append((char) 46);

            for(j=48;j<58;j++) {//pentru cifre
                if (sentence.codePointAt(i) == j)
                    nouString = nouString.append((char)j);
            }
        }
        System.out.println("Propozitia (fourth choice) este " + nouString);
        return nouString;
    }

    private static void countLettersSentence(String sentence) {
        int i = 0;
        int numberLetters_a = 0;
        int numberLetters_b = 0;
        int numberLetters_c = 0;
        int numberLetters_d = 0;
        int numberLetters_e = 0;
        int numberLetters_f = 0;
        int numberLetters_g = 0;
        int numberLetters_h = 0;
        int numberLetters_i = 0;
        int numberLetters_j = 0;
        int numberLetters_k = 0;
        int numberLetters_l = 0;
        int numberLetters_m = 0;
        int numberLetters_n = 0;
        int numberLetters_o = 0;
        int numberLetters_p = 0;
        int numberLetters_q = 0;
        int numberLetters_r = 0;
        int numberLetters_s = 0;
        int numberLetters_t = 0;
        int numberLetters_u = 0;
        int numberLetters_v = 0;
        int numberLetters_w = 0;
        int numberLetters_x = 0;
        int numberLetters_y = 0;
        int numberLetters_z = 0;

        int numberLetters_A = 0;
        int numberLetters_B = 0;
        int numberLetters_C = 0;
        int numberLetters_D = 0;
        int numberLetters_E = 0;
        int numberLetters_F = 0;
        int numberLetters_G = 0;
        int numberLetters_H = 0;
        int numberLetters_I = 0;
        int numberLetters_J = 0;
        int numberLetters_K = 0;
        int numberLetters_L = 0;
        int numberLetters_M = 0;
        int numberLetters_N = 0;
        int numberLetters_O = 0;
        int numberLetters_P = 0;
        int numberLetters_Q = 0;
        int numberLetters_R = 0;
        int numberLetters_S = 0;
        int numberLetters_T = 0;
        int numberLetters_U = 0;
        int numberLetters_V = 0;
        int numberLetters_W = 0;
        int numberLetters_X = 0;
        int numberLetters_Y = 0;
        int numberLetters_Z = 0;

        while (i < sentence.length()) {
            if (sentence.charAt(i) == (int) 'a') numberLetters_a++;
            if (sentence.charAt(i) == (int) 'b') numberLetters_b++;
            if (sentence.charAt(i) == (int) 'c') numberLetters_c++;
            if (sentence.charAt(i) == (int) 'd') numberLetters_d++;
            if (sentence.charAt(i) == (int) 'e') numberLetters_e++;
            if (sentence.charAt(i) == (int) 'f') numberLetters_f++;
            if (sentence.charAt(i) == (int) 'g') numberLetters_g++;
            if (sentence.charAt(i) == (int) 'h') numberLetters_h++;
            if (sentence.charAt(i) == (int) 'i') numberLetters_i++;
            if (sentence.charAt(i) == (int) 'j') numberLetters_j++;
            if (sentence.charAt(i) == (int) 'k') numberLetters_k++;
            if (sentence.charAt(i) == (int) 'l') numberLetters_l++;
            if (sentence.charAt(i) == (int) 'm') numberLetters_m++;
            if (sentence.charAt(i) == (int) 'n') numberLetters_n++;
            if (sentence.charAt(i) == (int) 'o') numberLetters_o++;
            if (sentence.charAt(i) == (int) 'p') numberLetters_p++;
            if (sentence.charAt(i) == (int) 'q') numberLetters_q++;
            if (sentence.charAt(i) == (int) 'r') numberLetters_r++;
            if (sentence.charAt(i) == (int) 's') numberLetters_s++;
            if (sentence.charAt(i) == (int) 't') numberLetters_t++;
            if (sentence.charAt(i) == (int) 'u') numberLetters_u++;
            if (sentence.charAt(i) == (int) 'v') numberLetters_v++;
            if (sentence.charAt(i) == (int) 'w') numberLetters_w++;
            if (sentence.charAt(i) == (int) 'x') numberLetters_x++;
            if (sentence.charAt(i) == (int) 'y') numberLetters_y++;
            if (sentence.charAt(i) == (int) 'z') numberLetters_z++;

            if (sentence.charAt(i) == (int) 'A') numberLetters_A++;
            if (sentence.charAt(i) == (int) 'B') numberLetters_B++;
            if (sentence.charAt(i) == (int) 'C') numberLetters_C++;
            if (sentence.charAt(i) == (int) 'D') numberLetters_D++;
            if (sentence.charAt(i) == (int) 'E') numberLetters_E++;
            if (sentence.charAt(i) == (int) 'F') numberLetters_F++;
            if (sentence.charAt(i) == (int) 'G') numberLetters_G++;
            if (sentence.charAt(i) == (int) 'H') numberLetters_H++;
            if (sentence.charAt(i) == (int) 'I') numberLetters_I++;
            if (sentence.charAt(i) == (int) 'J') numberLetters_J++;
            if (sentence.charAt(i) == (int) 'K') numberLetters_K++;
            if (sentence.charAt(i) == (int) 'L') numberLetters_L++;
            if (sentence.charAt(i) == (int) 'M') numberLetters_M++;
            if (sentence.charAt(i) == (int) 'N') numberLetters_N++;
            if (sentence.charAt(i) == (int) 'O') numberLetters_O++;
            if (sentence.charAt(i) == (int) 'P') numberLetters_P++;
            if (sentence.charAt(i) == (int) 'Q') numberLetters_Q++;
            if (sentence.charAt(i) == (int) 'R') numberLetters_R++;
            if (sentence.charAt(i) == (int) 'S') numberLetters_S++;
            if (sentence.charAt(i) == (int) 'T') numberLetters_T++;
            if (sentence.charAt(i) == (int) 'U') numberLetters_U++;
            if (sentence.charAt(i) == (int) 'V') numberLetters_V++;
            if (sentence.charAt(i) == (int) 'W') numberLetters_W++;
            if (sentence.charAt(i) == (int) 'X') numberLetters_X++;
            if (sentence.charAt(i) == (int) 'Y') numberLetters_Y++;
            if (sentence.charAt(i) == (int) 'Z') numberLetters_Z++;

            i++;
        }

        if (sentence.contains("a")) System.out.println("Sunt " + numberLetters_a + " litere 'a'");
        if (sentence.contains("b")) System.out.println("Sunt " + numberLetters_b + " litere 'b'");
        if (sentence.contains("c")) System.out.println("Sunt " + numberLetters_c + " litere 'c'");
        if (sentence.contains("d")) System.out.println("Sunt " + numberLetters_d + " litere 'd'");
        if (sentence.contains("e")) System.out.println("Sunt " + numberLetters_e + " litere 'e'");
        if (sentence.contains("f")) System.out.println("Sunt " + numberLetters_f + " litere 'f'");
        if (sentence.contains("g")) System.out.println("Sunt " + numberLetters_g + " litere 'g'");
        if (sentence.contains("h")) System.out.println("Sunt " + numberLetters_h + " litere 'h'");
        if (sentence.contains("i")) System.out.println("Sunt " + numberLetters_i + " litere 'i'");
        if (sentence.contains("j")) System.out.println("Sunt " + numberLetters_j + " litere 'j'");
        if (sentence.contains("k")) System.out.println("Sunt " + numberLetters_k + " litere 'k'");
        if (sentence.contains("l")) System.out.println("Sunt " + numberLetters_l + " litere 'l'");
        if (sentence.contains("m")) System.out.println("Sunt " + numberLetters_m + " litere 'm'");
        if (sentence.contains("n")) System.out.println("Sunt " + numberLetters_n + " litere 'n'");
        if (sentence.contains("o")) System.out.println("Sunt " + numberLetters_o + " litere 'o'");
        if (sentence.contains("p")) System.out.println("Sunt " + numberLetters_p + " litere 'p'");
        if (sentence.contains("q")) System.out.println("Sunt " + numberLetters_q + " litere 'q'");
        if (sentence.contains("r")) System.out.println("Sunt " + numberLetters_r + " litere 'r'");
        if (sentence.contains("s")) System.out.println("Sunt " + numberLetters_s + " litere 's'");
        if (sentence.contains("t")) System.out.println("Sunt " + numberLetters_t + " litere 't'");
        if (sentence.contains("u")) System.out.println("Sunt " + numberLetters_u + " litere 'u'");
        if (sentence.contains("v")) System.out.println("Sunt " + numberLetters_v + " litere 'v'");
        if (sentence.contains("w")) System.out.println("Sunt " + numberLetters_w + " litere 'w'");
        if (sentence.contains("x")) System.out.println("Sunt " + numberLetters_x + " litere 'x'");
        if (sentence.contains("y")) System.out.println("Sunt " + numberLetters_y + " litere 'y'");
        if (sentence.contains("z")) System.out.println("Sunt " + numberLetters_z + " litere 'z'");

        if (sentence.contains("A")) System.out.println("Sunt " + numberLetters_A + " litere 'A'");
        if (sentence.contains("B")) System.out.println("Sunt " + numberLetters_B + " litere 'B'");
        if (sentence.contains("C")) System.out.println("Sunt " + numberLetters_C + " litere 'C'");
        if (sentence.contains("D")) System.out.println("Sunt " + numberLetters_D + " litere 'D'");
        if (sentence.contains("E")) System.out.println("Sunt " + numberLetters_E + " litere 'E'");
        if (sentence.contains("F")) System.out.println("Sunt " + numberLetters_F + " litere 'F'");
        if (sentence.contains("G")) System.out.println("Sunt " + numberLetters_G + " litere 'G'");
        if (sentence.contains("H")) System.out.println("Sunt " + numberLetters_H + " litere 'H'");
        if (sentence.contains("I")) System.out.println("Sunt " + numberLetters_I + " litere 'I'");
        if (sentence.contains("J")) System.out.println("Sunt " + numberLetters_J + " litere 'J'");
        if (sentence.contains("K")) System.out.println("Sunt " + numberLetters_K + " litere 'K'");
        if (sentence.contains("L")) System.out.println("Sunt " + numberLetters_L + " litere 'L'");
        if (sentence.contains("M")) System.out.println("Sunt " + numberLetters_M + " litere 'M'");
        if (sentence.contains("N")) System.out.println("Sunt " + numberLetters_N + " litere 'N'");
        if (sentence.contains("O")) System.out.println("Sunt " + numberLetters_O + " litere 'O'");
        if (sentence.contains("P")) System.out.println("Sunt " + numberLetters_P + " litere 'P'");
        if (sentence.contains("Q")) System.out.println("Sunt " + numberLetters_Q + " litere 'Q'");
        if (sentence.contains("R")) System.out.println("Sunt " + numberLetters_R + " litere 'R'");
        if (sentence.contains("S")) System.out.println("Sunt " + numberLetters_S + " litere 'S'");
        if (sentence.contains("T")) System.out.println("Sunt " + numberLetters_T + " litere 'T'");
        if (sentence.contains("U")) System.out.println("Sunt " + numberLetters_U + " litere 'U'");
        if (sentence.contains("V")) System.out.println("Sunt " + numberLetters_V + " litere 'V'");
        if (sentence.contains("W")) System.out.println("Sunt " + numberLetters_W + " litere 'W'");
        if (sentence.contains("X")) System.out.println("Sunt " + numberLetters_X + " litere 'X'");
        if (sentence.contains("Y")) System.out.println("Sunt " + numberLetters_Y + " litere 'Y'");
        if (sentence.contains("Z")) System.out.println("Sunt " + numberLetters_Z + " litere 'Z'");
    }

    private static void checkSentence() throws MyException {
        System.out.println("Introduceti propozitia");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        int i;
        for (i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) < (int) 'a' || sentence.charAt(i) > (int) 'z') && (sentence.charAt(i) < (int) 'A' || sentence.charAt(i) > (int) 'Z') && sentence.charAt(i) != ' ' && sentence.charAt(i) != '\t' && sentence.charAt(i) != '-' && sentence.charAt(i) != '\'' && sentence.charAt(i) != ',' && sentence.charAt(i) != ':' && sentence.charAt(i) != '?' && sentence.charAt(i) != '!' && sentence.charAt(i) != '.' && (sentence.charAt(i) <(int) '0' || sentence.charAt(i) != '9')) {
                throw new MyException("Propozitia poate sa contina numai litere si cifre. Acestea pot fi legate intre ele sau separate prin caracterul spatiu, tab, cratima, apostrof, virgula, ':', semnul intrebarii, semnul exclamarii si punct");
            }
        }

        System.out.println("Inainte de conversie");
        //numararea literelor dintr-o propozitie inainte de conversie
        countLettersSentence(sentence);

        //conversia literelor dintr-o propozitie
        String newSentence = changeSentenceFirstChoice(sentence);
        StringBuilder newSentenceSecond = changeSentenceSecondChoice(sentence);
        StringBuilder newSentenceThird = changeSentenceThirdChoice(sentence);
        StringBuffer newSentenceFourth=changeSentenceFourthChoice(sentence);

        System.out.println("Dupa conversie");
        //numararea literelor dintr-o propozitie dupa conversie
        countLettersSentence(newSentence);
    }

    private static void writeSentence() {
        try {
            checkSentence();
        } catch (MyException exception) {
            System.out.println(exception);
            writeSentence();
        }
    }

    public static void main(String[] args) {
        writeSentence();
    }
}

