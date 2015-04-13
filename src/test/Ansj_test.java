package test;
import org.ansj.splitWord.analysis.ToAnalysis;
public class Ansj_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "您好！我是北京邮电大学电子工程学院通信工程的大三学生，由于课程已经基本结束，能够提供长期稳定的实习时间。暑期截止9月底可以全职实习，开学后可以保证每周至少四天的实习时间。很希望能够得到贵公司的这个实习机会！谢谢您的时间!";
		 System.out.println(ToAnalysis.parse(str));
	}

}
