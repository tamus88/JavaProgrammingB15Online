package Practicing;

public class EducationalInstitution {


        private int duration;


        public EducationalInstitution(int duration){
            this.duration = duration;
        }

        public String graduationRequirements(){
            return duration + " years of study";
        }


}
