package JavaRushLessons21;
/*
1. Определяем адрес сети

1) Даны IP-адрес и маска подсети, необходимо вычислить адрес сети - метод getNetAddress. Используйте операцию поразрядной конъюнкции (логическое И).

Пример:
IP-адрес:             11000000  10101000  00000001  00000010 (192.168.1.2)
Маска подсети:   11111111    11111111   11111110    00000000 (255.255.254.0)
Адрес сети:         11000000  10101000  00000000  00000000 (192.168.0.0)
2) Реализовать метод print, который выведет в консоль данные в двоичном коде
3) Метод main не участвует в тестировании
 */
public class IP {
    public static void main(String[] args) {
        byte[] ip  = new byte[]{(byte)192,(byte)168,1,2};
        byte[] mask  = new byte[]{(byte)255,(byte)255,(byte)254,0};
    byte[] netAdress = getNetAdress(ip,mask);
    print(netAdress);
    }

    /**
     * получаем 2 стринга: ip и маску подсети
     *
     */
    public static byte[] getNetAdress(byte ip[] , byte mask[]) {
        byte[] netAdress =  new byte[4];
        for(int i = 0; i<ip.length;i++){
            netAdress[i]=(byte) (ip[i]&mask[i]);
           // -64 -88 0 0
        }
        return netAdress;
    }

    public static void print(byte[] netAdress){
            for (byte b : netAdress) {
                String binStr = Integer.toBinaryString(b & 0xFF);
                System.out.print(("00000000" + binStr + " ").substring(binStr.length()));
            }

        }
    }


