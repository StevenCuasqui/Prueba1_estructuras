package estructuras;

import javax.swing.JOptionPane;

public class Aplicacion {

	public static void main(String[] args) {
		
		Materia materias[]= new Materia[3];
		for(int i=0; i<materias.length;i++){
			materias[i]= llenarMaterias();
			
		}
		
		
		JOptionPane.showMessageDialog(null, materias);

	}

		public static Profesor[] llenarProfesor(String m){
				
			Profesor profesores2[]= new Profesor[4];
			if(m.equals("Estructuras")){
			Profesor profesores[]= new Profesor[1];
			profesores[0]= new Profesor();
			profesores[0].setId(11);
			profesores[0].setNombre("Tivo");
			profesores2=profesores;
			}
			else if(m.equals("EDO")){
				Profesor profesores[]= new Profesor[2];
			profesores[0]= new Profesor();
			profesores[0].setId(12);
			profesores[0].setNombre("David");
			
			profesores[1]= new Profesor();
			profesores[1].setId(13);
			profesores[1].setNombre("Ernesto");
			profesores2=profesores;
			}
			else if (m.equals("Vecto")){
				Profesor profesores[]= new Profesor[1];
			profesores[0]= new Profesor();
			profesores[0].setId(12);
			profesores[0].setNombre("Washo");
			profesores2=profesores;
			}
			
			return profesores2;
			
		}
		
		public static Alumno[] llenarAlumno(){
			
			Alumno alumnos[]= new Alumno[2];
			alumnos[0]= new Alumno();
			alumnos[0].setId(21);
			alumnos[0].setNombre("Analy");
			
			alumnos[1]= new Alumno();
			alumnos[1].setId(22);
			alumnos[1].setNombre("Jorge");
			return alumnos;
		}
		
		public static Materia llenarMaterias(){
			
			Materia materia = new Materia();
			
			materia.setNombremateria(JOptionPane.showInputDialog("Ingrese el nombre de la materia"));
			materia.setProfesor(llenarProfesor(materia.getNombremateria()));
			materia.setCod(31);
			materia.setAsistentes(llenarAlumno());
			
			return materia;
		}
}
