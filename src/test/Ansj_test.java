package test;
import org.ansj.splitWord.analysis.ToAnalysis;
public class Ansj_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "���ã����Ǳ����ʵ��ѧ���ӹ���ѧԺͨ�Ź��̵Ĵ���ѧ�������ڿγ��Ѿ������������ܹ��ṩ�����ȶ���ʵϰʱ�䡣���ڽ�ֹ9�µ׿���ȫְʵϰ����ѧ����Ա�֤ÿ�����������ʵϰʱ�䡣��ϣ���ܹ��õ���˾�����ʵϰ���ᣡлл����ʱ��!";
		 System.out.println(ToAnalysis.parse(str));
	}

}
