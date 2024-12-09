import java.util.*;
class Login
{
    	static Scanner sc = new Scanner(System.in);
    	static String def = "\u001B[0m";
    	static String blink = "\u001B[5m";
    	static String red = "\u001B[31m";
    	static String green = "\u001B[32m";
    	static String yellow = "\u001B[33m";
    	static String blue = "\u001B[34m";
    	static String purple = "\u001B[35m";
	static String skblue = "\u001B[36m";
	static String gray = "\u001B[90m";
	static String Magenta = "\033[35m";
    	//static int rotp = (int)(Math.random() * (9999 - 1001 + 1) + 1001);
	static int rotp = (int)(Math.random() * 9000) + 1000;
	//static int rotp=(int)(Math.random() * 10000);
	static String otp=""+rotp;
    	//static int ni = 0;
	String otp()
	{
		System.out.print(blue);
		System.out.print("Enter OTP:");
		System.out.print(def);
		String c=sc.next();
		if(c.equals(otp))
		{
			System.out.println();
			System.out.print(green);
			System.out.println("Mobile number verified successfully ");
			System.out.println();
		}
		else
		{
			System.out.print(red);
			System.out.println("Invalid OTP");
			System.out.print(def);
			otp(); 
		}
		return c;
	}
	static void sleep(int a)
	{
		try
		{
			Thread.sleep(a);
		}
		catch(InterruptedException e)
		{
			
		}
	}
    	void pn(long num)
	{
		if(num>1000000000l&&num<9999999999l)
		{
			System.out.print(skblue);
			System.out.print("please Wait While we are Sending OTP");
			for(int i=0;i<5;i++)
			{
				System.out.print(". ");
				sleep(1000);
				
			}
			System.out.println();
			System.out.print("Your OTP for MYNTRA is ");
			System.out.print(def);
			System.out.println(otp);
			String b=otp();
			if(b.equals(otp))
			{
			System.out.println();
			}
			/*else
			{
			System.out.println("Invalid OTP");
			otp(); 
			}*/
			System.out.print(def);	
		}
		else
		{
			System.out.print(red);
			System.out.println("Invalid Mobile Number. Please try again.");
			System.out.println();
    			pn(sc.nextLong());
		}
		
    	}

}
class krishna
{

	static Scanner sc = new Scanner(System.in);
    	static String def = "\u001B[0m";
    	static String red = "\u001B[31m";
    	static String green = "\u001B[32m";
    	static String yellow = "\u001B[33m";
    	static String blue = "\u001B[34m";
    	static String purple = "\u001B[35m";
	static String skblue = "\u001B[36m";
	static String gray = "\u001B[90m";
	static String Magenta = "\033[35m";
	static String reset=  "\u001B[0m";

// Bold
    public static final String BLACK_BOLD = "\033[1;30m"; // BLACK
    public static final String RED_BOLD = "\033[1;31m"; // RED
    public static final String GREEN_BOLD = "\033[1;32m"; // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m"; // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m"; // CYAN
    public static final String WHITE_BOLD = "\033[1;37m"; // WHITE
    public static final String BOLD = "\u001B[1m";

    // bold reset
    public static final String BOLD_RESET = "\u001B[0m";

    // Underline
    public static final String black_ul = "\033[4;30m"; // BLACK
    public static final String red_ul = "\033[4;31m"; // RED
    public static final String green_ul = "\033[4;32m"; // GREEN
    public static final String yellow_ul = "\033[4;33m"; // YELLOW
    public static final String blue_ul = "\033[4;34m"; // BLUE
    public static final String purple_ul = "\033[4;35m"; // PURPLE
    public static final String cyan_ul = "\033[4;36m"; // CYAN
    public static final String white_ul = "\033[4;37m"; // WHITE

    // _background colors
    public static final String black_bg = "\033[40m"; // BLACK
    public static final String red_bg = "\033[41m"; // RED
    public static final String green_bg = "\033[42m"; // GREEN
    public static final String yellow_bg = "\033[43m"; // YELLOW
    public static final String blue_bg = "\033[44m"; // BLUE
    public static final String purple_bg = "\033[45m"; // PURPLE
    public static final String cyan_bg = "\033[46m"; // CYAN
    public static final String white_bg = "\033[47m"; // WHITE

    public static final String change = "\u001B[7m";
    public static final String thick = "\u001B[1m";

    // _background color reset
    public static final String bgreset = "\u001B[49m";

    // High Intensity
    public static final String black_bt = "\033[0;90m"; // BLACK
    public static final String red_bt = "\033[0;91m"; // RED
    public static final String green_bt = "\033[0;92m"; // GREEN
    public static final String yellow_bt = "\033[0;93m"; // YELLOW
    public static final String blue_bt = "\033[0;94m"; // BLUE
    public static final String purple_bt = "\033[0;95m"; // PURPLE
    public static final String cyan_bt = "\033[0;96m"; // CYAN
    public static final String white_bt = "\033[0;97m"; // WHITE

    // Bold High Intensity
    public static final String black_bd_bt = "\033[1;90m"; // BLACK
    public static final String red_bd_bt = "\033[1;91m"; // RED
    public static final String green_bd_bt = "\033[1;92m"; // GREEN
    public static final String yellow_bd_bt = "\033[1;93m";// YELLOW
    public static final String blue_bd_bt = "\033[1;94m"; // BLUE
    public static final String purple_bd_bt = "\033[1;95m";// PURPLE
    public static final String cyan_bd_bt = "\033[1;96m"; // CYAN
    public static final String white_bd_bt = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String black_bg_bt = "\033[0;100m";// BLACK
    public static final String red_bg_bt = "\033[0;101m";// RED
    public static final String green_bg_bt = "\033[0;102m";// GREEN
    public static final String yellow_bg_bt = "\033[0;103m";// YELLOW
    public static final String blue_bg_bt = "\033[0;104m";// BLUE
    public static final String purple_bg_bt = "\033[0;105m"; // PURPLE
    public static final String cyan_bg_bt = "\033[0;106m"; // CYAN
    public static final String white_bg_bt = "\033[0;107m"; // WHITE

    //public static Scanner sc = new Scanner(System.in);

    // //underline reset
    static String rstul = "\u001B[24m";

    // //blinking
    static String blink = "\u001B[5m";

    // //reset blinking
    static String rstblink = "\u001B[0m";

    // //italic
    static String ital = "\u001B[3m";

	static void sleep(int a)
	{
		try
		{
			Thread.sleep(a);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	public static void main(String[] args)
	{
		String a=blue+"ddddddoooollxKXXXXK0KKXXXO:... ;0OdO00KO0KxOXXkcxXo:OOc.     .',,ckkocc::cccc::::;;;;;;loc\n" + //
                "dddddddoollox0XKK0OO0KK0Ox;... .cc;::::;:c,:cc,';:'';;....   .',;cxxolllcllllllllcccccllc:\n" + //
                "dddddddoolooxxxdolccclcc::'.'.         ...              ...  .';;;:c::::;::;;;;;;;;;;;;;;;\n" + //
                "dddddddoolllodoooolcccccc:'.'...........,;'',,.        .... ..,;;cooolccc::::cccc::cccc:::\n" + //
                "dddddddolollk000000OkOOOko'.''..............;;;;'       ......,,;oOkOOOOkdoodkOOkkkkkkxoc;\n" + //
                "ddddddoooollkKKKK00O00000d'.''..  .............':,...... ..,,,,,;dOOKXXXK0kk0KXKKXXXK0kdc;\n" + //
                "ddddddoooolokK000OOO000K0o.....  ..';ldxkkd:....,'.  ..... ..';,:xOk0XXXK00KXXKKKXXXXKkoc;\n" + //
                "ddddddoollloOK00OOOOO000Ol...   .';cdk00000Ol,..';;,.':c,.  ..,,ckOxkKXXXK0KXNXKKXXK00ko:;\n" + //
                "odddooooolloO0O00OOOO00Okc...  .':ccllodddoxoc;'cddooooo:.  .',,ckkdx0XXKKXKXXXXXKX0xOkl:,\n" + //
                "ooooooooolld0KKKXK0O0K0KOc......,llllldxxoldxxl;,,;,'',;'.  .',,cxkddkOkkO00KKKKKKKkdxxl;,\n" + //
                "oooooooollldKXXXNXXXXO0X0:..','.,looc:cloodOOxl;.............,,':xxdoddloooodddxOOxllooc;,\n" + //
                "llllllllllcd0NNNNXKOd:l0O;..,;,..,'.,lddl;':lc::;,,,''',,,,,,,,,:dxdoooclxOOOkddkxl:::cc;,\n" + //
                "lllllllclllx0K0OOxolcld0O;.',;,. ..':ooxkl'...';;;;;;;;;;;;;;;;,:odolcccldkOOOdddoc:::::;,\n" + //
                "lllooolloooxKX0klc:;;o0Xk;';;:c,.  ....';,...,:lcccc::::ccc:::;;cdxxlcccodddxxdolccc::c:;;\n" + //
                "lcllooollllxKNNXklc:cxKXx,':::l;..        ..,cd0xllolclllllc::::lkOOxollooodooxkxdlllloc::\n" + //
                "cccccllllookKNXXOooooOXXx,';,,d:......  ..',:cxKOc:llcllllllc::cokO0kddoooooodO0KOoollll::\n" + //
                "ccccoolcoodkXNNXXXKX00Od:,''.;Ox:'.''..',;;:dk0X0c.,;:coddolccccox0KkdxxdddoodxOOxdxdllc::\n" + //
                "ooodxxdodxxOXXXXNXOxl;,,.....,dkxocccclllldkOOO0O:....;ldddolccclx0KOxxkxddddddoooxOkdol::\n" + //
                "ddddxxddxxkOKKKX0d:'...'.... .:xxxxxxddxkO0OOkkOKd'. .,;:ldxxdoxdx0KOxkxxdddxkxdookOkdll:,\n" + //
                "00OOOkkkkkO0KKK0o;'...........cO0OOOOOkOOO00KKKKXk;...,,;:coxxxOOk0K0000O0OO00OOkk00Oxooc:\n" + //
                "KKK0OO0KKKKK0Okl,.............:k0000000000KKKKKKK0l'..;;',;;codOOkKK000OO00OOOkxkO000kxkdd\n" + //
                "0000kkO00KKKK0k:..............'x00KKO000000KKKKKKKx;..;;'''',:ldkOKK000OkOkxxdoldkOOkdcc;,\n" + //
                "000OOkO0KKKKKOo,...'...........lO0KKKK000000KKKKKKO:..;,'''.,::ldkOOkkOkkOkxdoooxOOOkocc;,\n" + //
                "kOOOkkOOO000KOc'...............;xK00KK00OOOO0000KKk;.';;'...',,;lodxxxxdxxdoooooddxkxocc:;\n" + //
                "kkkkxxkkkO000k:.................oK000K000OOOO00000k,..,:,....',,:clx0000OOkkxxxddddxxollcl\n" + //
                "xxxxxxxkkO000x:.............,'..:O000K0000OOOOOOOOd...,:;'....',;:coOKK0KK00OOOkkOOOOkkkxx\n" + //
                "xxxxxxxkkOO00d,'............,,. ;O000000000OOOOOOOl...,::,'....,;:cldO000000OOkkOOOO0kOOOO\n" + //
                "xxxxxxxkkkkO0l'.............''. ;O00O00000000000OOl...';::'. ...,;:clxKXKKKK0OOOOOkOOk0KK0\n" + //
                "xxxxxdxxxkOOOc''....  ......''. ;kK0O00000000000OOl..';,,:,.  ..';;:ld0XKKK00OO00O0K0O0000\n" + //
                "OOkkOkkOOOOOx:','.... ......... ,k00OO00000000000Oc..';;',,     ...,cok00KKKKKKKK0000O0000\n" + //
                "XXKXXXXXXXXN0c'''..... ........ 'x00OO0000000000Okc..';:;,;.   ...',;:xKXXKK00000000OO00OO\n" + //
                "KK0KXXXXNNNNKo,..''.....''..... 'd000OO0000000000k:..,;:;;;:. ..,,,,;:lk0KKK0KKKK00OOkOOOO\n" + //
                "K0KXXXXXXNNX0o;'''.... ..'..... 'dO00OOO00000000Ox, .',;:;;c,.'',;:,;coOXXNXKKXXK000000K00\n" + //
                "K00KXXXXXXXKkl;''..... ........ 'dkO00OOOO00000OOd' .',;:;,::,,;:;,;:lkXNNNK0KXNX00KKKKK00\n" + //
                "K00KXXXXXXX0d:,'''''... ....... 'dkO00OOOOOOOOOOOl...,,;:;,;::;;:;',:o0NNNXK0KNNK00KXKK000\n" + //
                "KKKKXXXXXXX0o;''','..... ...... 'xkkOO0OOOOOOOOOk:...',;c:,';cl::;,'cONWNNXK0KNNK00KKKKOO0\n" + //
                "KKKXXXXXXXKOo;'..''.'''...... ..,xkkkO00OOOOOOOOd'....';c:'.';cc,,cccONNNNK00XNNKO0KKK0O00\n" + //
                "KKKKKXXXXNKOdc;,,'''''''..... ..'dkxkkO000OkkOOk:..''.';:;,'.':l:,:co0NNNXK0KXNXKO0KKK0000\n" + //
                "KKKKK00OOOkxdllc:;,,,,,,,....  ..lOkkkkO00OkkOkd' .,'.';;,;;'.,:,'';kNXNWX00KXXX0O0KK00000\n" + //
                "OOOkkkkxddooc;;::;;;;;,',;,..    :kkkxkkOOOOOOkc. .,'.,;;,,,,,'';lkKNNNNNX00KXXX0O0KK00000\n" + //
                "kkkxxdooolloldkOd:;;;;,,,;;,.    .oOkkkkkkOOOOk:......';;;,',;,cONNNNNNNNK00XXXX0O0KK0O0K0\n" + //
                "kkxkkOO00Okkk0XX0o:;;;,'',;:,.    .lkOkkkxxkkkx,......',;;,',;;l0WNNXXXXXK0KXXXK0O0K0OO0K0\n" + //
                "00KKKKKKK0kxk0XX0Odc;,'...,:c;..   .ckOOOkkkxxd;.......,,;;,;::l0NNXXNNXX0OKXXXKOO00OO0KK0\n" + //
                "0KKKKKKKKOkxkKXX0OOd:....',:ll:'..  .ckkkkkkxxd:.......,,,,';cco0NXXXNXXKOOKXXXKOkOOkO0000\n" + //
                "000KKKKK0kxxOKXX000Ox:','',;cl:,'.  .,xkxxxdooo:''''..','',,:ccoKNXXXXXX0O0KXXXKOk00kO000O"+reset;

                                                                                                                                                                                                      
		String s=green+"     #### ##    ###  ##    ##     ###  ## ##  ###           ##  ##    ## ##   ##  ###           ##  ###  ### ##     ####    ## ##   ###  ##  ###  ##    ##                ##     ###  ##  ###  ##    ##\n"+     
 			      "     # ## ##    ##  ##     ##      ## ##  ##  ##            ##  ##   ##   ##  ##   ##           ##  ##    ##  ##     ##    ##   ##   ##  ##    ## ##     ##               ##       ## ##    ## ##     ##\n"+    
 		 		"  \t##      ##  ##   ## ##    # ## #  ## ##             ##  ##   ##   ##  ##   ##           ## ##     ##  ##     ##    ####      ##  ##   # ## #   ## ##             ## ##    # ## #   # ## #   ## ##\n"+   
   				"  \t##      ## ###   ##  ##   ## ##   ## ##              ## ##   ##   ##  ##   ##           ## ##     ## ##      ##     #####    ## ###   ## ##    ##  ##            ##  ##   ## ##    ## ##    ##  ##\n"+  
   				"  \t##      ##  ##   ## ###   ##  ##  ## ###              ##     ##   ##  ##   ##           ## ###    ## ##      ##        ###   ##  ##   ##  ##   ## ###            ## ###   ##  ##   ##  ##   ## ###\n"+  
   				"  \t##      ##  ##   ##  ##   ##  ##  ##  ##              ##     ##   ##  ##   ##           ##  ##    ##  ##     ##    ##   ##   ##  ##   ##  ##   ##  ##            ##  ##   ##  ##   ##  ##   ##  ##\n"+  
			       "       ####    ###  ##  ###  ##  ###  ##  ##  ###             ##      ## ##    ## ##            ##  ###  ####  ##   ####    ## ##   ###  ##  ###  ##  ###  ##            ### ##  ###  ##  ###  ##   ### ##"+reset; 
		
		for(int i=0;i<a.length();i++)
		{
			System.out.print(a.charAt(i));		
			sleep(5);
		}
		System.out.println("\n\n\n");
		
		for(int i=0;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
			sleep(5);
		}
	}
}
interface Myntra
{
	int Tommy_Hilfiger();
	int VAN_HEUSEN();
	int USPolo();
	int HIGHLANDER_DENIM();
	int WRANGLER_MEN_MILLARD();
	int NIKE();
	int ALLEN_SOLLY();
	void Shirt();
	void Jeans();
	void TShirts();
}
interface Myntra1
{
	int Prada();
	int Balenciaga();
	int IndoEra();
	int FabIndia();
	int Janasya();
	void Saree();
	void KurthaSet();
}
interface Myntra2
{
	int DNMX();
	int GAP();
	int Boycode();
	int Lee_Cooper();
	int Team_Spirit();
	int Babyhug();
	int Levis_kids();
	int Berrytree();
	int Max();
	int HM_kids();
	void Shirts();
	void TroUsers();
	void Tshirts();
	void Frocks();
}
class Men extends Login implements Myntra
{
	static float Bill=0;
	static Scanner sc=new Scanner(System.in);
	static String Size()
	{
		System.out.println(purple+"				Select Size\n"+skblue+"				XL\n				L\n				M\n				S\n				XS"+def);
		String p="XL";
		String q="L";
		String r="M";
		String s="S";
		String t="XS";
		String a=sc.next().toUpperCase();
		if(a.equals(p)||a.equals(q)||a.equals(r)||a.equals(s)||a.equals(t))
		//System.out.println(a);
		return a;
		else
		{
			System.out.print(red);
			System.out.println("Enter Correct Size"+def);
			Size();
		}
		return a;
	}
	static String PantColors()
    {
		//System.out.print();
        System.out.println(purple+"                            	Select color :"+def);
        String r = "red";
        String g = "green";
        String b = "blue";
        String G = "gray";
        String B = "Black";
        String sk = "skblue";
        System.out.println(blue+"                            	BLUE\n"+gray+"                            	GRAY\n"+skblue+"                            	SKYBLUE\n"+green+"			    	GREEN\n"+def);
        System.out.println(def);
        String p=sc.next().toLowerCase();
        if(p.equals(b)||p.equals(G)||p.equals(sk)||p.equals(g))
        {
            return p;
        }
        else
        {
            System.out.println(red+"Sorry!.. The Color is Not Available "+def);
            return PantColors();
        }
    }
	static String ShirtColors()
    {
        System.out.println("                            	Select color :");
        String r = "red";
        String g = "green";
        String y = "yellow";
        String b = "blue";
        String c = "cyan";
        String G = "gray";
        String B = "Black";
        String pp = "purple";
        String sk = "skblue";
        System.out.println(blue+"                            	BLUE\n"+red+"                            	RED\n"+gray+"                            	GRAY\n"+green+"			    	GREEN\n"+yellow+"			    	YELLOW\n"+purple+"			    	PURPLE\n"+def);
        System.out.println(def);
        String p=sc.next().toLowerCase();
        if(p.equals(b)||p.equals(r)||p.equals(G)||p.equals(g)||p.equals(y)||p.equals(pp))
        {
            return p;
        }
        else
        {
            System.out.println(red+"Sorry!.. The Color is Not Available "+def);
            return ShirtColors();
        }
    }

	static int b=0;	
	public int Tommy_Hilfiger()
	{
		b=0;
		String s=Size();
		String cr=ShirtColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=2000;
		b=b*c;
		return b;
	}
	public int VAN_HEUSEN()
	{
		b=0;
		String s=Size();
		String cr=ShirtColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=1700;
		b=b*c;
		return b;
	}
	public int USPolo()
	{
		b=0;
		String s=Size();
		String cr=ShirtColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=2500;
		b=b*c;
		return b;
	}
	public int HIGHLANDER_DENIM()
	{
		b=0;
		String s=Size();
		String cr=ShirtColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=1500;
		b=b*c;
		return b;
	}
	public int WRANGLER_MEN_MILLARD()
	{
		b=0;
		String s=Size();
		String cr=ShirtColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=3200;
		b=b*c;
		return b;
	}
	public int NIKE()
	{
		b=0;
		String s=Size();
		String cr=ShirtColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=1199;
		b=b*c;
		return b;
	}
	public int ALLEN_SOLLY()
	{
		b=0;
		String s=Size();
		String cr=ShirtColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=799;
		b=b*c;
		return b;
	}
	public void Shirt()
	{
		System.out.println(purple+"				Brands\n"+yellow+"				1.Tommy_Hilfiger	Rs:2000\n				2.VAN_HEUSEN	  	Rs:1700\n				3.USPolo		Rs:2500\n				4.HIGHLANDER_DENIM	Rs.1500\n				5.WRANGLER_MEN_MILLARD	Rs.3200\n"+def);

		String Select=sc.next();
		switch(Select) 
		{
		case "1": Bill=Bill+Tommy_Hilfiger();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int a=sc.nextInt();
		        if(a==1)
				{    	
					User.m1();
				}
				else if(a==2)
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}else{
					System.out.println("Invalid Input..");
					//Tommy_Hilfiger();
				}
			break;
		case "2": Bill=Bill+VAN_HEUSEN();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int b=sc.nextInt();
		        if(b==1)
				{    	
					User.m1();
				}
				else if(b==2)
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}else
				{
					System.out.print("Invalid Input..");
				}
			break;
		case "3": Bill=Bill+USPolo();
			System.out.println(red+"				1.Continue Shopping");
			System.out.println("				2.Place order"+def);
		        int c=sc.nextInt();
		        if(c==1)
				{    	
					User.m1();
				}
				else if(c==2)
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}else{
					System.out.print("Invalid Input..");
				}
			break;
		case "4": Bill=Bill+HIGHLANDER_DENIM();
			System.out.println(red+"				1.Continue Shopping");
			System.out.println("				2.Place order"+def);
		        int d=sc.nextInt();
		        if(d==1)
				{    	
					User.m1();
				}
				else if(d==2)
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}else{
				System.out.println("Invalid Input..");
				}
			break;
		case "5": Bill=Bill+WRANGLER_MEN_MILLARD();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int e=sc.nextInt();
		        if(e==1)
				{    	
					User.m1();
				}
				else if(e==2)
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}else{
				System.out.println("Invalid Input..");
				}
				break;
		default :
			System.out.println(red+"Invalid Input.."+def);
			Shirt();
		}
	}
	int r=0;
	public int Tommy_Hilfiger(int a)
	{
		String s=Size();
		String cr=PantColors();
		System.out.println(skblue+"Enter number of Jeans:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=1000;
		r=r*c;
		return r;
	}
	public int VAN_HEUSEN(int a)
	{
		r=0;
		String s=Size();
		String cr=PantColors();
		System.out.println(skblue+"Enter number of Jeans:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=1500;
		r=r*c;
		return r;
	}
	public int USPolo(int a)
	{
		r=0;
		String s=Size();
		String cr=PantColors();
		System.out.println(skblue+"Enter number of Jeans:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=2000;
		r=r*c;
		return r;
	}
	public int HIGHLANDER_DENIM(int a)
	{
		r=0;
		String s=Size();
		String cr=PantColors();
		System.out.println(skblue+"Enter number of Jeans:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=1500;
		r=r*c;
		return r;
	}
	public int WRANGLER_MEN_MILLARD(int a)
	{
		r=0;
		String s=Size();
		String cr=PantColors();
		System.out.println(skblue+"Enter number of Jeans:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=3200;
		r=r*c;
		return r;
	}
	public void Jeans()
	{
		System.out.println(purple+"				Brands\n"+yellow+"				1.Tommy_Hilfiger	Rs:1000\n				2.VAN_HEUSEN	  	Rs:1500\n				3.USPolo		Rs:2000\n				4.HIGHLANDER_DENIM	Rs.1500\n				5.WRANGLER_MEN_MILLARD	Rs.3200\n"+def);

		String select=sc.next();
		switch(select)
		{
			case "1": Bill=Bill+Tommy_Hilfiger(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int a=sc.nextInt();
		        	if(a==1)
					{	
						User.m1();
					}
					else if(a==2)
					{
						User.payment();
						System.out.println();
						User.payMethod();
					}else{
					System.out.println("Invalid Input..");
					}
				break;
			case "2": Bill=Bill+VAN_HEUSEN(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int b=sc.nextInt();
		        	if(b==1)
					{		
						User.m1();
					}
					else if(b==2)
					{
						User.payment();
						System.out.println();
						User.payMethod();
					}else{
						System.out.println("Invalid Input..");
					}
				break;
			case "3": Bill=Bill+USPolo(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int c=sc.nextInt();
		        	if(c==1)
					{	
						User.m1();
					}
					else if(c==2)
					{
						User.payment();
						System.out.println();
						User.payMethod();
					}else{
						System.out.println("Invalid Input..");
					}
				break;
			case "4": Bill=Bill+HIGHLANDER_DENIM(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int d=sc.nextInt();
		        	if(d==1)
					{	
						User.m1();
					}
					else if(d==2)
					{
						User.payment();
						System.out.println();
						User.payMethod();
					}else{
						System.out.println("Invalid Input..");
					}
				break;
			case "5": Bill=Bill+WRANGLER_MEN_MILLARD(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int e=sc.nextInt();
		        	if(e==1)
					{	
						User.m1();
					}
					else if(e==2)
					{
						User.payment();
						System.out.println();
						User.payMethod();
					}else{
						System.out.println("Invalid Input..");
					}
				break;
			default :
				System.out.println(red+"Invalid Input.."+def);
				Jeans();
		}
	}
	public void TShirts()
	{
		System.out.println(purple+"				Brands\n"+yellow+"				1.Tommy_Hilfiger	Rs:2000\n				2.VAN_HEUSEN	  	Rs:1700\n				3.USPolo		Rs:2500\n				4.NIKE			Rs.1199\n				5.ALLEN_SOLLY		Rs.799\n"+def);
		String select=sc.next();
		switch(select)
		{
			case "1":Bill=Bill+Tommy_Hilfiger();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int a=sc.nextInt();
		        if(a==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "2":Bill=Bill+VAN_HEUSEN();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int b=sc.nextInt();
		        if(b==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "3":Bill=Bill+USPolo();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int c=sc.nextInt();
		        if(c==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "4":Bill=Bill+NIKE();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int d=sc.nextInt();
		        if(d==1)
				{
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "5":Bill=Bill+ALLEN_SOLLY();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int e=sc.nextInt();
		        if(e==1)
				{
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			default :
				System.out.println(red+"Invalid Input.."+def);
				TShirts();
		}
	}
}
class Women extends Login implements Myntra1
{
	static float Bill=0;
	
	static Scanner sc=new Scanner(System.in);

	static String Size()
	{
		System.out.println(purple+"				Select Size\n"+skblue+"				XL\n				L\n				M\n				S\n				XS"+def);
		String p="XL";
		String q="L";
		String r="M";
		String s="S";
		String t="XS";
		String a=sc.next().toUpperCase();
		if(a.equals(p)||a.equals(q)||a.equals(r)||a.equals(s)||a.equals(t))
		//System.out.println(a);
		return a;
		else
		{
		System.out.println(red+"Enter Correct Size"+def);
		Size();
		}
		return a;
	}
	static String SariColors()
    {
        System.out.println(purple+"                            	Select color :"+def);
        String r = "red";
        String g = "green";
        String y = "yellow";
        String b = "blue";
        String c = "cyan";
        String G = "Gray";
        String B = "Black";
        String pp = "purple";
        String sk = "skblue";
        System.out.println(blue+"                            	BLUE\n"+red+"                            	RED\n"+skblue+"                            	SKYBLUE\n"+green+"			    	GREEN\n"+yellow+"			    	YELLOW\n"+def);
        System.out.println(def);
        String p=sc.next().toLowerCase();
        if(p.equals(b)||p.equals(r)||p.equals(sk)||p.equals(g)||p.equals(y))
        {
            return p;
        }
        else
        {
			System.out.print(red);
            System.out.println("Sorry!.. The Color is Not Available "+def);
            return SariColors();
        }
    }		
	static int b=0;	
	public int Prada()
	{
		//String s=Size();
		Saritype();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Sarees:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=2000;
		b=b*c;
		return b;
	}
	public int Balenciaga()
	{
		b=0;
		//String s=Size();
		Saritype();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Sarees:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=1700;
		b=b*c;
		return b;
	}
	public int IndoEra()
	{
		b=0;
		//String s=Size();
		Saritype();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Sarees:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=2500;
		b=b*c;
		return b;
	}
	public int FabIndia()
	{
		b=0;
		//String s=Size();
		Saritype();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Sarees:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=1749;
		b=b*c;
		return b;
	}
	public int Janasya()
	{
		b=0;
		//String s=Size();
		Saritype();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Sarees:"+def);
		int a=sc.nextInt();
		b=b+a;
		int c=1299;
		b=b*c;
		return b;
	}
	public int Saritype()
	{
		System.out.println(skblue+"				Type of Sari\n"+purple+"				1.COTTON_SARI\n				2.SILK_SARI\n"+def);
		int r=sc.nextInt();
		if(r==1||r==2)
		{
			return r;	
		}
		else
		{
			System.out.println(red+"Invalid Input"+def);
			Saritype();
		}
		return r;
	}
	public void Saree()
	{
		System.out.println(purple+"				Brands\n"+yellow+"				1.Prada			Rs:2000\n				2.Balenciaga	  	Rs:1700\n				3.IndoEra		Rs:2500\n				4.FABINDIA		Rs.1749\n				5.Janasya		Rs.1299\n"+def);

		String Select=sc.next();
		switch(Select) 
		{
		case "1": Bill=Bill+Prada();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int a=sc.nextInt();
		        if(a==1)
			{   	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
				
			 break;
		case "2": Bill=Bill+Balenciaga();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int b=sc.nextInt();
		        if(b==1)
			{   	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
			break;
		case "3": Bill=Bill+IndoEra();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int c=sc.nextInt();
		        if(c==1)
			{	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
			break;
		case "4": Bill=Bill+FabIndia();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int d=sc.nextInt();
		        if(d==1)
			{	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
			break;
		case "5": Bill=Bill+Janasya();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int e=sc.nextInt();
		        if(e==1)
			{	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
			break;
		default :
			System.out.println(red+"Invalid Input.."+def);
			Saree();
		}
	}
	int r=0;
	public int Prada(int a)
	{
		String s=Size();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Kurtha Sets:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=1000;
		r=r*c;
		return r;
	}
	public int Balenciaga(int a)
	{
		r=0;
		String s=Size();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Kurtha Sets:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=1500;
		r=r*c;
		return r;
	}
	public int IndoEra(int a)
	{
		r=0;
		String s=Size();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Kurtha Sets:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=2000;
		r=r*c;
		return r;
	}
	
	public int FabIndia(int a)
	{
		r=0;
		String s=Size();
		String cr=SariColors();
		System.out.println(skblue+"Enter number of Kurtha Sets:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=1749;
		r=r*c;
		return r;

	}
	public int Janasya(int a)
	{
		r=0;
		String s=Size();
		String cr=SariColors();
		System.out.println(red+"Enter number of Kurtha Sets:"+def);
		int d=sc.nextInt();
		r=r+d;
		int c=1299;
		r=r*c;
		return r;
	}
	public void KurthaSet()
	{
		System.out.println(purple+"				Brands\n"+yellow+"				1.Prada			Rs:1000\n				2.Balenciaga	  	Rs:1500\n				3.Indo_Era		Rs:2000\n				4.FABINDIA		Rs.1749\n				5.Janasya		Rs.1299\n"+def);

		String select=sc.next();
		switch(select)
		{
			case "1": Bill=Bill+Prada(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int a=sc.nextInt();
		        	if(a==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
				break;
			case "2": Bill=Bill+Balenciaga(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int b=sc.nextInt();
		        	if(b==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
				break;
			case "3": Bill=Bill+IndoEra(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int c=sc.nextInt();
		        	if(c==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
				break;
			case "4": Bill=Bill+FabIndia(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int d=sc.nextInt();
		        	if(d==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
				break;
			case "5": Bill=Bill+Janasya(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        	int e=sc.nextInt();
		        	if(e==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
				break;
			default :
			System.out.println(red+"Invalid Input..."+def);
			KurthaSet();
		}
	}	
}
class Kids extends Login implements Myntra2
{
	static float Bill=0;
	static Scanner sc = new Scanner(System.in);
	
	static String Size()
	{
		System.out.println(purple+"				Select Size\n"+skblue+"				XXXS\n				XXS\n				XS\n				S"+def);
		String m="XXXS";
		String n="XXS";
		String o="XS";
		String p="S";
		
		String a=sc.next().toUpperCase();
		if(a.equals(m)||a.equals(n)||a.equals(o)||a.equals(p))
		//System.out.println(a);
		return a;
		else
		{
		System.out.println(red+"Enter Correct Size"+def);
		Size();
		}
		return a;
	}
	static String kidsColors()
    {
        System.out.println(purple+"                            	Select color :"+def);
        String r = "red";
        String g = "green";
        String y = "yellow";
        String b = "blue";
        String c = "cyan";
        String G = "Gray";
        String B = "Black";
        String pp = "purple";
        String sk = "skblue";
        System.out.println(blue+"                            	BLUE\n"+red+"                            	RED\n"+skblue+"                            	SKYBLUE\n"+green+"			    	GREEN\n"+yellow+"			    	YELLOW\n"+purple+"			    	PURPLE"+def);
        System.out.println(def);
        String p=sc.next().toLowerCase();
        if(p.equals(b)||p.equals(r)||p.equals(sk)||p.equals(g)||p.equals(y)||p.equals(pp))
        {
            return p;
        }
        else
        {
			System.out.print(red);
            System.out.println(red+"Sorry!.. The Color is Not Available "+def);
            return kidsColors();
        }
    }
	static int v=0;
	public int DNMX()
	{
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		v=v+a;
		int c=1699;
		v=v*c;
		return v;
	}
	public int GAP()
	{
		v=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		v=v+a;
		int c=1999;
		v=v*c;
		return v;
	}
	public int Boycode()
	{
		v=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		v=v+a;
		int c=999;
		v=v*c;
		return v;
	}
	public int Lee_Cooper()
	{
		v=0;	
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		v=v+a;
		int c=1899;
		v=v*c;
		return v;
	}
	public int Team_Spirit()
	{
		v=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Shirts:"+def);
		int a=sc.nextInt();
		v=v+a;
		int c=899;
		v=v*c;
		return v;
	}
	public void Shirts()
	{
		System.out.println(purple+"				Brands\n"+yellow+"				1.DNMX				Rs:1699\n				2.GAP				Rs.1999\n				3.Boycode			Rs.999\n				4.Lee_Cooper			Rs.1899\n				5.Team_Spirit			Rs.899"+def);
		String Select=sc.next();
		switch(Select) 
		{
			case "1": Bill=Bill+DNMX();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int a=sc.nextInt();
		        if(a==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "2": Bill=Bill+GAP();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int b=sc.nextInt();
		        if(b==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}	
			 	break;
			case "3": Bill=Bill+Boycode();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int c=sc.nextInt();
		        if(c==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "4": Bill=Bill+Lee_Cooper();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int d=sc.nextInt();
		        if(d==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "5": Bill=Bill+Team_Spirit();
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int e=sc.nextInt();
		        if(e==1)
				{
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			default :
				System.out.print(red+"Invalid Input..."+def);
				Shirts();
		}
	}
	static int h=0;
	public int DNMX(int a)
	{
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of TroUsers:"+def);
		int x=sc.nextInt();
		h=h+x;
		int c=2099;
		h=h*c;
		return h;
	}
	public int GAP(int b)
	{
		h=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of TroUsers:"+def);
		int a=sc.nextInt();
		h=h+a;
		int c=2399;
		h=h*c;
		return h;
	}
	public int Boycode(int c)
	{
		h=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of TroUsers:"+def);
		int a=sc.nextInt();
		h=h+a;
		int i=1399;
		h=h*i;
		return h;
	}
	public int Lee_Cooper(int d)
	{	
		h=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of TroUsers:"+def);
		int a=sc.nextInt();
		h=h+a;
		int c=2099;
		h=h*c;
		return h;
	}
	public int Team_Spirit(int e)
	{	
		h=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of TroUsers:"+def);
		int a=sc.nextInt();
		h=h+a;
		int c=1499;
		h=h*c;
		return h;
	}
	public void TroUsers()
	{
		System.out.println(purple+"				Brands:\n"+yellow+"				1.DNMX				Rs:2099\n				2.GAP				Rs.2399\n				3.Boycode			Rs.1399\n				4.Lee_Cooper			Rs.2099\n				5.Team_Spirit			Rs.1499"+def);
		String Select=sc.next();
		switch(Select)
		{
			case "1": Bill=Bill+DNMX(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int a=sc.nextInt();
		        if(a==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "2": Bill=Bill+GAP(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int b=sc.nextInt();
		        if(b==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "3": Bill=Bill+Boycode(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		     	int c=sc.nextInt();
		        if(c==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "4": Bill=Bill+Lee_Cooper(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int d=sc.nextInt();
		        if(d==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}	
			 	break;
			case "5": Bill=Bill+Team_Spirit(1);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int e=sc.nextInt();
		        if(e==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}		
			 	break;
			default:
				System.out.print(red+"Invalid Input"+def);
				TroUsers();
		}
	}
	static int x=0;
	public int DNMX(boolean a)
	{
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of T-shirts:"+def);
		int g=sc.nextInt();
		x=x+g;
		int c=999;
		x=x*c;
		return x;
	}
	public int GAP(boolean b)
	{
		x=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of T-shirts:"+def);
		int a=sc.nextInt();
		x=x+a;
		int c=1099;
		x=x*c;
		return x;
	}
	public int Boycode(boolean c)
	{
		x=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of T-shirtss:"+def);
		int a=sc.nextInt();
		x=x+a;
		int d=899;
		x=x*d;
		return x;
	}
	public int Lee_Cooper(boolean d)
	{	
		x=0;
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of T-shirts:"+def);
		int a=sc.nextInt();
		x=x+a;
		int c=1199;
		x=x*c;
		return x;
	}
	public int Team_Spirit(boolean e)
	{
		x=0;	
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of T-Shirts:"+def);
		int a=sc.nextInt();
		x=x+a;
		int c=699;
		x=x*c;
		return x;
	}
	public void Tshirts()
	{
		System.out.println(purple+"				Brands\n"+yellow+"				1.DNMX				Rs:999\n				2.GAP				Rs.1099\n				3.Boycode			Rs.899\n				4.Lee_Cooper			Rs.1199\n				5.Team_Spirit			Rs.699"+def);
		String Select=sc.next();
		switch(Select)
		{
			case "1": Bill=Bill+DNMX(true);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int a=sc.nextInt();
		        if(a==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "2": Bill=Bill+GAP(true);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int b=sc.nextInt();
		        if(b==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "3": Bill=Bill+Boycode(true);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int c=sc.nextInt();
		        if(c==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "4": Bill=Bill+Lee_Cooper(true);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int d=sc.nextInt();
		        if(d==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			case "5": Bill=Bill+Team_Spirit(true);
				System.out.println(red+"				1.Continue Shopping"+def);
				System.out.println(red+"				2.Place order"+def);
		        int f=sc.nextInt();
		        if(f==1)
				{	
					User.m1();
				}
				else
				{
					User.payment();
					System.out.println();
					User.payMethod();
				}
			 	break;
			default :
				System.out.print(red+"Invalid Input..."+def);
		  		Tshirts();
		}
	}
	static int r=0;
	public int Babyhug()
	{
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Frocks:"+def);
		int x=sc.nextInt();
		r=r+x;
		int c=1599;
		r=r*c;
		return r;
	}
	public int Levis_kids()
	{
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Frocks:"+def);
		int x=sc.nextInt();
		r=r+x;
		int c=1199;
		r=r*c;
		return r;
	}
	public int Berrytree()
	{
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Frocks:"+def);
		int x=sc.nextInt();
		r=r+x;
		int c=1249;
		r=r*c;
		return r;
	}
	public int Max()
	{
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Frocks:"+def);
		int x=sc.nextInt();
		r=r+x;
		int c=999;
		r=r*c;
		return r;
	}
	public int HM_kids()
	{
		String s=Size();
		String cr=kidsColors();
		System.out.println(skblue+"Enter number of Frocks:"+def);
		int x=sc.nextInt();
		r=h+x;
		int c=1799;
		r=r*c;
		return r;
	}
	public void Frocks()
	{
		System.out.println(purple+"				Brands:\n"+yellow+"				1.BABYHUG			Rs:1599\n				2.LEVI'S_KIDS			Rs.1199\n				3.BERRYTREE			Rs.1249\n				4.MAX				Rs.999\n				5.HM_KIDS			Rs.1799"+def);
		String Select=sc.next();
		switch(Select)
		{
			case "1": Bill=Bill+Babyhug();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int a=sc.nextInt();
		        if(a==1)
			{ 	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
				
			 break;
		case "2": Bill=Bill+Levis_kids();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int b=sc.nextInt();
		        if(b==1)
			{  	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
				
			 break;
		case "3": Bill=Bill+Berrytree();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int c=sc.nextInt();
		        if(c==1)
			{  	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
				
			 break;
		case "4": Bill=Bill+Max();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int d=sc.nextInt();
		        if(d==1)
			{  	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
				
			 break;
		case "5": Bill=Bill+HM_kids();
			System.out.println(red+"				1.Continue Shopping"+def);
			System.out.println(red+"				2.Place order"+def);
		        int e=sc.nextInt();
		        if(e==1)
			{  	
				User.m1();
			}
			else
			{
				User.payment();
				System.out.println();
				User.payMethod();
			}
				
			 break;
		default :
			System.out.println(red+"Invalid Input..."+def);
		  	Frocks();
		}
	}
}
class Bank extends Login
{
	static Scanner sc=new Scanner(System.in);
	private long cardNumber = 987654321;
	private String Name = "Rasagna";
	private int cvv = 876;
	private int Ppin = 1503;
	private int Gpin = 1906;
	/*void setcardNumber(int cardNumber)
	{
		this.cardNumber = cardNumber;
	}*/
	long getcardNumber()
	{
		return cardNumber;
	}
	String getName()
	{
		return Name;
	}
	private int mon=12;
	private int year=2028;
	int getMon()
	{
		return mon;
	}
	int getYear()
	{
		return year;
	}
	int getcvv()
	{
		return cvv;
	}
	int getPpin()
	{
		return Ppin;
	}
	int getGpin()
	{
		return Gpin;
	}
	boolean cardNumber()
	{
		System.out.print(skblue);
		System.out.print("Enter card number:");
		System.out.print(def);
		long a=sc.nextLong();
		if(a==getcardNumber())
		{
			System.out.print(skblue);
			System.out.print("Enter Name:");
			System.out.print(def);
			String s=sc.next();
			if(s.equals(getName()))
			{
				System.out.print(skblue);
				System.out.println("Enter validation date:"+"\n"+ "MM/YYYY");
				System.out.print(def);
				int c=sc.nextInt();
				if(c==getMon())
				{
					int b=sc.nextInt();
					if(b==getYear())
					{
						System.out.println(c+"/"+b);
						System.out.print(skblue);
						System.out.print("Enter cvv:");
						System.out.print(def);
						int d=sc.nextInt();
						if(d==getcvv())
						{
							System.out.print(skblue);
							System.out.print("Enter amount:");
							System.out.print(def);
							float e=sc.nextFloat();
							if(e==(User.y+99))
							{	
								System.out.print(blink);
								System.out.println(green+"				Your payment is successful");
								System.out.println(green+"				your Order is placed"+def);
								
							}
							else
							{
								System.out.print(red);
								System.out.println("Enter correct Amount");
								System.out.print(def);
								amount();
							}
							return true;
						}
						else
						{
							System.out.print(red);
							System.out.println("Invalid cvv.Please enter again");
							System.out.print(def);
							cvv();
						}
					}
					else
					{
						System.out.print(red);
						System.out.println("Invalid Year");
						System.out.print(skblue);
						System.out.println("12/YYYY");
						System.out.print(def);
						year();
					}
				}
				else
				{
					System.out.print(red);
					System.out.println("Invalid Month");
					System.out.print(skblue);
					System.out.println("MM/YYYY");
					System.out.print(def);
					mon();
				}
			}
			else
			{
			System.out.print(red);
			System.out.println("Invalid name.Please enter again");
			System.out.print(def);
			name();
			}
		}
		else
		{
		System.out.print(red);
		System.out.println("Invalid card number.Please enter again");
		System.out.print(def);
		System.out.println();
		cardNumber();
		}
		return false;
		//System.out.println("		Your payment is successful");
	}
	boolean name()
	{
		System.out.print(skblue);
		System.out.print("Enter Name:");
		System.out.print(def);
			String s=sc.next();
			if(s.equals(getName()))
			{
				System.out.print(skblue);
				System.out.println("Enter validation date:"+"\n"+ "MM/YYYY");
				System.out.print(def);
				int c=sc.nextInt();
				if(c==getMon())
				{
					int b=sc.nextInt();
					if(b==getYear())
					{
						System.out.println(c+"/"+b);
						System.out.print(skblue);
						System.out.print("Enter cvv:");
						System.out.print(def);
						int d=sc.nextInt();
						if(d==getcvv())
						{
							System.out.print(skblue);
							System.out.print("Enter amount:");
							System.out.print(def);
							float e=sc.nextFloat();
							if(e==(User.y+99))
							{
								System.out.print(blink);
								System.out.println(green+"				Your payment is successful");
								System.out.println(green+"				your Order is placed"+def);
							}
							else
							{
								System.out.print(red);
								System.out.println("Enter correct Amount");
								System.out.print(def);
								amount();
							}
							return true;
						}
						else
						{
							System.out.print(red);
							System.out.println("Invalid cvv.Please enter again");
							System.out.print(def);
							cvv();
						}
					}
					else
					{
						System.out.print(red);
						System.out.println("Invalid Year");
						System.out.print(skblue);
						System.out.println("12/YYYY");
						System.out.print(def);
						year();
					}
				}
				else
				{
					System.out.print(red);
					System.out.println("Invalid Month");
					System.out.print(skblue);
					System.out.println("MM/YYYY");
					System.out.print(def);
					mon();
				}
			}
			else
			{
			System.out.print(red);
			System.out.println("Invalid name.Please enter again");
			System.out.print(def);
			name();
			}
			return false;
	}
	boolean mon()
	{
				int c=sc.nextInt();
				if(c==getMon())
				{
					int b=sc.nextInt();
					if(b==getYear())
					{
						System.out.println(c+"/"+b);
						System.out.print(skblue);
						System.out.print("Enter cvv:");
						System.out.print(def);
						int d=sc.nextInt();
						if(d==getcvv())
						{
							System.out.print(skblue);
							System.out.print("Enter amount:");
							System.out.print(def);
							float e=sc.nextFloat();
							if(e==(User.y+99))
							{
								System.out.print(blink);
								System.out.println(green+"				Your payment is successful");
								System.out.println(green+"				your Order is placed"+def);
							}
							else
							{
								System.out.print(red);
								System.out.println("Enter correct Amount");
								System.out.print(def);
								amount();
							}
							return true;
						}
						else
						{
							System.out.print(red);
							System.out.println("Invalid cvv.Please enter again");
							System.out.print(def);
							cvv();
						}
					}
					else
					{
						System.out.print(red);
						System.out.println("Invalid Year");
						System.out.print(skblue);
						System.out.println("12/YYYY");
						System.out.print(def);
						year();
					}
				}
				else
				{
					System.out.print(red);
					System.out.println("Invalid Month");
					System.out.print(skblue);
					System.out.println("MM/YYYY");
					System.out.print(def);
					mon();
				}
				return false;
	}
	boolean year()
	{
					int b=sc.nextInt();
					if(b==getYear())
					{
						System.out.println(12+"/"+b);
						System.out.print(skblue);
						System.out.print("Enter cvv:");
						System.out.print(def);
						int d=sc.nextInt();
						if(d==getcvv())
						{
							System.out.print(skblue);
							System.out.print("Enter amount:");
							System.out.print(def);
							float e=sc.nextFloat();
							if(e==(User.y+99))
							{
								System.out.print(blink);
								System.out.println(green+"				Your payment is successful");
								System.out.println(green+"				your Order is placed"+def);
							}
							else
							{
								System.out.print(red);
								System.out.println("Enter correct Amount");
								System.out.print(def);
								amount();
							}
							return true;
						}
						else
						{
							System.out.print(red);
							System.out.println("Invalid cvv.Please enter again");
							System.out.print(def);
							cvv();
						}
					}
					else
					{
						System.out.print(red);
						System.out.println("Invalid Year");
						System.out.print(skblue);
						System.out.println("12/YYYY");
						System.out.print(def);
						year();
					}
					return false;
	}
	boolean cvv()
	{
		System.out.print(skblue);
		System.out.print("Enter cvv:");
		System.out.print(def);
					int d=sc.nextInt();
					if(d==getcvv())
					{
						System.out.print(skblue);
						System.out.print("Enter amount:");
						System.out.print(def);
						float e=sc.nextFloat();
						if(e==(User.y+99))
						{
							System.out.print(blink);
							System.out.println(green+"				Your payment is successful");
							System.out.println("				your Order is placed"+def);
						}
						else
						{
							System.out.print(red);
							System.out.println("Enter correct Amount");
							System.out.print(def);
							amount();
						}
						return true;
					}
					else
					{
					System.out.print(red);
					System.out.println("Invalid cvv.Please enter again");
					System.out.print(def);
					cvv();
					}
		return false;
	}
	boolean amount()
	{
		System.out.print(skblue);
		System.out.print("Enter amount:");
		System.out.print(def);
		float e=sc.nextFloat();
		if(e==(User.y+99))
		{
		System.out.print(blink);
		System.out.println(green+"				Your payment is successful");
		System.out.println(green+"				your Order is placed"+def);
		}
		else
		{
		System.out.print(red);
		System.out.println("Enter correct Amount");
		System.out.print(def);
		amount();
		}
		return false;
	}
	boolean amount1()
	{
		System.out.print(skblue);
		System.out.print("Enter amount:");
		System.out.print(def);
		float e=sc.nextFloat();
		if(e==(User.y+99))
		{
			System.out.println("Enter Pin:");
			int f=sc.nextInt();
			if(f==getPpin())
			{
				System.out.print(blink);
				System.out.println(green+"				Your payment is successful");
				System.out.println(green+"				your Order is placed"+def);
			}
			else
			{
			System.out.println(red+"Invalid Pin.Please enter again"+def);
			Ppin();
			}
		}
		else
		{
		System.out.print(red);
		System.out.println("Enter correct Amount");
		System.out.print(def);
		amount();
		}
		return false;
	}
	boolean amount2()
	{
		System.out.print(skblue);
		System.out.print("Enter amount:");
		System.out.print(def);
		float e=sc.nextFloat();
		if(e==(User.y+99))
		{
			System.out.print("Enter Pin:");
			int g=sc.nextInt();
			if(g==getGpin())
			{
				System.out.print(blink);
				System.out.println(green+"				Your payment is successful");
				System.out.println(green+"				your Order is placed"+def);
			}
			else
			{
				System.out.println(red+"Invalid Pin.Please enter again"+def);
				Gpin();
			}
		}
		else
		{
		System.out.print(red);
		System.out.println("Enter correct Amount");
		System.out.print(def);
		amount();
		}
		return false;
	}
	boolean Ppin()
	{
		System.out.print(skblue);
		System.out.print("Enter Pin:");
		System.out.print(def);
		int f=sc.nextInt();
		if(f==getPpin())
		{
			System.out.print(blink);
			System.out.println(green+"				Your payment is successful");
			System.out.println(green+"				your Order is placed"+def);
		}
		else
		{
			System.out.println(red+"Invalid Pin.Please enter again"+def);
			Ppin();
		}
		return false;
	}
	boolean Gpin()
	{
		System.out.print(skblue+"Enter Pin:"+def);
		int g=sc.nextInt();
		if(g==getGpin())
		{
			System.out.print(blink);
			System.out.println(green+"				Your payment is successful");
			System.out.println(green+"				your Order is placed"+def);
		}
		else
		{
			System.out.println(red+"Invalid Pin.Please enter again"+def);
			Gpin();
		}
		return false;
	}			
}

class User extends Login
{
	static User u=new User();
	static Myntra m=new Men();
	static Myntra1 w=new Women();
	static Myntra2 x=new Kids();
	static Bank b=new Bank();
	static float y=0;
	static void payment()
	{
		y=(Men.Bill)+(Women.Bill)+(Kids.Bill);
		System.out.println();
		//System.out.print(blink);
		System.out.println(yellow+"				Total MRP---------------- Rs: "+y);
		System.out.println("				Convenience Fee---------- Rs: "+99);
		if(y>=5000)
		{
			float f=0.2f;
			float d=y*f;
			System.out.println("				Discount----------20%"+"  -- Rs: "+d);
			y-=d;
		}
		else
		{
			System.out.println("				Shop upto 5000 & get 20% off");
		}
		
		System.out.println("				--------------------------------------"); 
		System.out.println("				Total Amount	  	  Rs: "+(y+99)+def);
		System.out.println();
	}
	static void payMethod()
	{
		System.out.println(purple+"				Payment Method\n"+skblue+"				1.Pay Online\n				2.Cash on Delivery"+def);
		int a=sc.nextInt();
		if(a==1)
		{
			System.out.println(purple+"				Select payment method\n"+gray+"				1.UPI\n				2.Card"+def);
			int n=sc.nextInt();
			switch(n)
			{
				case 1:UPI();break;
				case 2:Card();break;
				default : 
					System.out.println(red+"Invalid Input.."+def);
					payMethod();
			}
		}
		else if(a==2)
		{
			System.out.print(blink);
			System.out.println(green+"				Your Order is placed"+def);
		}
		else{
			System.out.println(red+"Invalid Input.."+def);
			payMethod();
		}
	}
	//----------UPI--------------	
	static void UPI()
	{
		System.out.println(purple+"				Select payment method\n"+yellow+"				1.PhonePay\n				2.GooglePay"+def);
		int a=sc.nextInt();
		switch(a)
		{
			case 1:PhonePay();break;
			case 2:GooglePay();break;
			default :
				System.out.println(red+"Invalid Input.."+def);
				UPI();
		}
	}
	static boolean PhonePay()
	{
		System.out.print(skblue);
		System.out.print("Enter amount:");
		System.out.print(def);
		float e=sc.nextFloat();
		if(e==(User.y+99))
		{
			System.out.print(blue+"Enter Pin:"+def);
			int f=sc.nextInt();
			if(f==b.getPpin())
			{
				System.out.print(blink);
				System.out.println(green+"				Your payment is successful");
				System.out.println("				your Order is placed"+def);
			}
			else
			{
				System.out.println(red+"Invalid Pin.Please enter again"+def);
				b.Ppin();
			}
		}
		else
		{
		System.out.print(red);
		System.out.println("Enter correct Amount");
		System.out.print(def);
		b.amount1();
		}
		return false;
	}
	static boolean GooglePay()
	{
		System.out.print(skblue);
		System.out.print("Enter amount:");
		System.out.print(def);
		float e=sc.nextFloat();
		if(e==(User.y+99))
		{
			System.out.print("Enter Pin:");
			int g=sc.nextInt();
			if(g==b.getGpin())
			{
				System.out.print(blink);
				System.out.println(green+"				Your payment is successful");
				System.out.println("				your Order is placed"+def);
			}
			else
			{
				System.out.println(red+"Invalid Pin.Please enter again"+def);
				b.Gpin();
			}
		}
		else
		{
		System.out.print(red);
		System.out.println("Enter correct Amount");
		System.out.print(def);
		b.amount2();
		}
		return false;
	}
	
	//-----------cards-------------
	
	static void Card()
	{
		System.out.println(purple+"				Select card\n"+skblue+"				1.CreditCard\n				2.DebitCard"+def);
		int a=sc.nextInt();
		switch(a)
		{
			case 1:CreditCard();break;
				
			case 2:DebitCard();break;
			default :
				System.out.println(red+"Invalid Input "+def);
				Card();
		}
	}
	static boolean CreditCard()
	{
		System.out.print(skblue);
		System.out.print("Enter card number:");
		System.out.print(def);
		long a=sc.nextLong();
		if(a==b.getcardNumber())
		{
			System.out.print(skblue);
			System.out.print("Enter Name:");
			System.out.print(def);
			String s=sc.next();
			if(s.equals(b.getName()))
			{
				System.out.print(skblue);
				System.out.println("Enter validation date:"+"\n"+ "MM/YYYY");
				System.out.print(def);
				int c=sc.nextInt();
				if(c==b.getMon())
				{
					int x=sc.nextInt();
					if(x==b.getYear())
					{
					System.out.println(c+"/"+x);
					System.out.print(skblue);
					System.out.print("Enter cvv:");
					System.out.print(def);
					int d=sc.nextInt();
					if(d==b.getcvv())
					{
						System.out.print(skblue);
						System.out.print("Enter amount:");
						System.out.print(def);
						float e=sc.nextFloat();
						if(e==(User.y+99))
						{
						System.out.print(blink);
						System.out.println(green+"				Your payment is successful");
						System.out.println("				your Order is placed"+def);
						}
						else
						{
						System.out.print(red);
						System.out.println("Enter correct Amount");
						System.out.print(def);
						b.amount();
						}
						return true;
					}
					else
					{
					System.out.print(red);
					System.out.println("Invalid cvv.Please enter again");
					System.out.print(def);
					b.cvv();
					}
					}
					else
					{
						System.out.print(red);
						System.out.println("Invalid Year");
						System.out.print(skblue);
						System.out.println("12/YYYY");
						System.out.print(def);
						b.year();
					}
				}
				else
				{
					System.out.print(red);
					System.out.println("Invalid Month");
					System.out.print(skblue);
					System.out.println("MM/YYYY");
					System.out.print(def);
					b.mon();
				}
			}
			else
			{
			System.out.print(red);
			System.out.println("Invalid name.Please enter again");
			System.out.print(def);
			b.name();
			}
		}
		else
		{
		System.out.print(red);
		System.out.println("Invalid card number.Please enter again");
		System.out.print(def);
		System.out.println();
		b.cardNumber();
		}
		return false;
		//System.out.println("		Your payment is successful");
	}
	static boolean DebitCard()
	{
		System.out.print(skblue);
		System.out.print("Enter card number:");
		System.out.print(def);
		long a=sc.nextLong();
		if(a==b.getcardNumber())
		{
			System.out.print(skblue);
			System.out.print("Enter Name:");
			System.out.print(def);
			String s=sc.next();
			if(s.equals(b.getName()))
			{
				System.out.print(skblue);
				System.out.println("Enter validation date:"+"\n"+ "MM/YYYY");
				System.out.print(def);
				int c=sc.nextInt();
				if(c==b.getMon())
				{
					int x=sc.nextInt();
					if(x==b.getYear())
					{
					System.out.println(c+"/"+x);
					System.out.print(skblue);
					System.out.print("Enter cvv:");
					System.out.print(def);
					int d=sc.nextInt();
					if(d==b.getcvv())
					{
						System.out.print(skblue);
						System.out.print("Enter amount:");
						System.out.print(def);
						float e=sc.nextFloat();
						if(e==(User.y+99))
						{
						System.out.print(blink);
						System.out.println(green+"				Your payment is successful");
						System.out.println("				your Order is placed"+def);
						}
						else
						{
						System.out.print(red);
						System.out.println("Enter correct Amount");
						System.out.print(def);
						b.amount();
						}
						return true;
					}
					else
					{
					System.out.print(red);
					System.out.println("Invalid cvv.Please enter again");
					System.out.print(def);
					b.cvv();
					}
					}
					else
					{
						System.out.print(red);
						System.out.println("Invalid Year");
						System.out.print(skblue);
						System.out.println("12/YYYY");
						System.out.print(def);
						b.year();
					}
				}
				else
				{
					System.out.print(red);
					System.out.println("Invalid Month");
					System.out.print(skblue);
					System.out.println("MM/YYYY");
					System.out.print(def);
					b.mon();
				}
			}
			else
			{
			System.out.print(red);
			System.out.println("Invalid name.Please enter again");
			System.out.print(def);
			b.name();
			}
		}
		else
		{
		System.out.print(red);
		System.out.println("Invalid card number.Please enter again");
		System.out.print(def);
		System.out.println();
		b.cardNumber();
		}
		return false;
		//System.out.println("		Your payment is successful");
	}

	static void m1()
	{
		System.out.println(purple+"				Category"+def);
		System.out.print(yellow);
		System.out.println("				1.Men\n				2.Women\n			        3.Kids");
		System.out.print(def);
		String a=sc.next();
		switch(a)
		{
			case "1":mens();break;
			case "2":Women();break;			
			case "3":KIDs();break;
			default:
				System.out.println(red+"Invalid Input"+def);
				m1();
		}
	}
	static void mens()
	{
		System.out.println(purple+"				Available Items\n"+blue+"				1.Shirt\n				2.Jeans\n				3.T-Shirts"+def);
		String select=sc.next();
		switch(select)
		{
			case "1":m.Shirt();break;
			case "2":m.Jeans();break;
			case "3":m.TShirts();break;
			default:
				System.out.println(red+"Invalid Input"+def);
				mens();
		}
	}
	static void Women()
	{
		System.out.println(purple+"				Available Items\n"+blue+"				1.Saree\n				2.Kurtha Set"+def);
			String select1=sc.next();
			switch(select1)
			{
				case "1":w.Saree();break;
				case "2":w.KurthaSet();break;
				default : System.out.println(red+"Invalid Input"+def);
				Women();
			}
	}
	static void KIDs()
	{
		System.out.println(purple+"				Available Items\n"+blue+"				1.Shirts\n				2.TroUsers\n				3.Tshirts\n				4.FROCKS\n"+def);
			String select2=sc.next();
			switch(select2)
			{
				case "1": x.Shirts();break;
				case "2": x.TroUsers();break;
				case "3": x.Tshirts();break;
				case "4": x.Frocks();break;	
				default : System.out.println(red+"Invalid Input"+def);
				KIDs();
			}
	}
	static Scanner sc=new Scanner(System.in);

	static void sleep(int a)
	{
		try
		{
			Thread.sleep(a);
		}
		catch(InterruptedException e)
		{
		}
	}
		
	public static void main(String[]args)
	{
        System.out.print(red+blink+"      >=>       >=> >=>      >=> >==>    >=> >===>>=====> >======>           >>       \n");
	sleep(300);
        System.out.print("      >> >=>   >>=>  >=>    >=>  >> >=>  >=>      >=>     >=>    >=>        >>=>      \n");
	sleep(300);
        System.out.print("      >=> >=> > >=>   >=> >=>    >=> >=> >=>      >=>     >=>    >=>       >> >=>     \n");
	sleep(300);
        System.out.print("      >=>  >=>  >=>     >=>      >=>  >=>>=>      >=>     >> >==>         >=>  >=>    \n");
	sleep(300);
        System.out.print("      >=>   >>  >=>     >=>      >=>   > >=>      >=>     >=>  >=>       >=====>>=>   \n");
	sleep(300);
        System.out.print("      >=>       >=>     >=>      >=>    >>=>      >=>     >=>    >=>    >=>      >=>  \n");
	sleep(300);
        System.out.print("      >=>       >=>     >=>      >=>     >=>      >=>     >=>      >=> >=>        >=> \n"+def);	
	sleep(300);
	System.out.println();
	System.out.println(yellow+"							  Ab Har Koi Reason Chalega!");	
	System.out.println();
	System.out.println();
		Login l1 = new Login();
		User u=new User();
		System.out.print(def);
            	System.out.print(skblue);
            	System.out.println("              	 **************************************");
            	System.out.print(yellow);
            	System.out.print(blink);
            	System.out.println("       		       ---- WELCOME TO MYNTRA ----");
				System.out.print(red);
            	System.out.println("               	       Fashion is instant language         ");
            	System.out.print(def);
            	System.out.print(skblue);
            	System.out.println("         	 **************************************");
				System.out.println();
            	System.out.print(blue);
            	System.out.print("Enter mobile number : ");
				System.out.print(def);
            	l1.pn(sc.nextLong());
		m1();
		System.out.print(blue);
		System.out.print(def);
	}
}
