package first_assignment;

public class Assignment2Array3D {

	public static void main(String[] args) {
		
		
		/*String [][][] result= new String [4][5][2];
		
		result[0][0][0]="Mathematics 1";
		result[0][0][1]="Pass(78)";
		
		result[0][1][0]="Physics";
		result[0][1][1]="Pass(85)";
		
		result[0][2][0]="Chemistry";
		result[0][2][1]="Fail(21)";
		
		result[0][3][0]="Computer Programming";
		result[0][3][1]="Pass(74)";
		
		result[0][4][0]="Engineering Drawing";
		result[0][4][1]="Pass(88)";
		
		result[0][5][0]="Basic Electrical Engg.";
		result[0][5][1]="Pass(79)"; */
		
		String [][][] result1 = {
				//0 index -- Sem1
				{	
					//-----------
					//0 index -- Sem1 -- (Subject, Marks) [0][0][0],[0][0][1]
					{"Mathematics 1", "Pass (78)"},
					//1 index -- Sem1 -- (Subject, Marks) [0][1][0],[0][1][1]
					{"Physics", "Pass (85)"},
					//2 index -- Sem1 -- (Subject, Marks) [0][2[0],[0][2][1]
					{"Chemistry", "Fail (21)"},
					//3 index -- Sem1 -- (Subject, Marks)  [0][3][0],[0][3][1]
					{"Computer Programming", "Pass (74)"},
					//4 index -- Sem1 -- (Subject, Marks) [0][4][0],[0][4][1]
					{"Engineering Drawing", "Pass (88)"},
					//5 index -- Sem1 -- (Subject, Marks) [0][5][0],[0][5][1]
					{"Basic Electrical Engg.", "Pass (79)"}
				},
				
				//1 index -- Sem2
				{	
					//-----------
					//0 index -- Sem2 -- (Subject, Marks) [1][0][0],[1][0][1]
					{"Mathematics II", "Pass (82)"},
					//1 index -- Sem2 -- (Subject, Marks) [1][1][0],[1][1][1]
					{"Mechanics", "Pass (77)"},
					//2 index -- Sem2 -- (Subject, Marks) [1][2][0],[1][2][1]
					{"Enviromental Sci", "Pass (93)"},
					//3 index -- Sem2 -- (Subject, Marks) [1][3][0],[1][3][1]
					{"Basic Electronics", "Fail (19)"}, 
					//4 index -- Sem2 -- (Subject, Marks) [1][4][0],[1][4][1]
					{"Engineering Physics", "Fail (24)"},
					//5 index -- Sem2 -- (Subject, Marks) [1][5][0],[1][5][1]
					{"Engineering Graphics", "Pass (90)"}
				},
				
				//2 index -- Sem3
				{	
					//-----------
					//0 index -- Sem3 -- (Subject, Marks) [2][0][0],[2][0][1]
					{"Data Strusture", "Pass (88)"},
					//1 index -- Sem3 -- (Subject, Marks) [2][1][0],[2][1][1]
					{"Descrete Mathmatics", "Pass (81)"},
					//2 index -- Sem3 -- (Subject, Marks) [2][2][0],[2][2][1]
					{"Digital Elecronics", "Pass (76)"},
					//3 index -- Sem3 -- (Subject, Marks) [2][3][0],[2][3][1]
					{" Operating Systems", "Fail (32)"},
					//4 index -- Sem3 -- (Subject, Marks) [2][4][0],[2][4][1]
					{"Signals and Systems", "Pass (85)"},
					//5 index -- Sem3 -- (Subject, Marks) [2][5][0],[2][5][1]
					{" Object-Oriented Prog.", "Pass (78)"}
				},
				
				//3 index -- Sem4
				{	
					//-----------
					//0 index -- Sem4 -- (Subject, Marks)
					{"Algorithms", "Pass (91)"},
					//1 index -- Sem4 -- (Subject, Marks)
					{"Computer Networks", "Pass (73)"},
					//2 index -- Sem4 -- (Subject, Marks)
					{"Database Systems", "Fail (19)"},
					//3 index -- Sem4 -- (Subject, Marks)
					{" Microprocessors", "Pass (80)"},
					//4 index -- Sem4 -- (Subject, Marks)
					{"Communication Eng.", "Pass (76)"},
					//5 index -- Sem4 -- (Subject, Marks)
					{" Software Engineering", "Pass (87)"}
				},
				
				//4 index -- Sem5
				{	
					//-----------
					//0 index -- Sem4 -- (Subject, Marks)
					{"Probability Stats", "Pass (86)"},
					//1 index -- Sem4 -- (Subject, Marks)
					{"Machine Learning", "Pass (88)"},
					//2 index -- Sem4 -- (Subject, Marks)
					{"Compiler Design", "Pass (84)"},
					//3 index -- Sem4 -- (Subject, Marks)
					{" Theory of Computation", "Pass (95)"},
					//4 index -- Sem4 -- (Subject, Marks)
					{"Embedded Systems", "Pass (73)"},
					//5 index -- Sem4 -- (Subject, Marks)
					{" Computer Graphics", "Pass (90)"}
				}
			};
				
		
			System.out.println("Semester 2 Subject 4 and Subject 5 names.: "+result1[1][3][0]+"     "+ result1[1][4][0]);
			System.out.println("the Status/Marks of Semester 4 Subject 3 and Subject 6.: " + result1[3][2][1]+"   "+result1[3][5][1] );
				
				
		}
	
	}


