public class Complex {
        private Integer real;
        private Integer image;

        Complex()
        {
        }

        Complex(int real,int image)
        {
            this.real = real;
            this.image = image;
        }

        public Integer getReal() {
            return real;
        }

        public Integer getImage() {
            return image;
        }

        public void setReal(Integer real) {
            this.real = real;
        }

        public void setImage(Integer image) {
            this.image = image;
        }

        void printInfo()
        {
            if (this.getReal()==null || this.getImage()==null )
            {
                System.out.println("Not initialized");
                return;
            }

            if (this.getReal()==0 && this.getImage()==0 )
            {
                System.out.println("This complex number is: 0");
                return;
            }

            String info=new String("This complex number is: ");
            if(this.getReal()!=0)
            {
                info+=this.getReal();
                if(this.getImage()>0)
                    info+="+";
            }

            if (this.getImage()==1)
            {
                info+="i";
                System.out.println(info);
                return;
            }

            if (this.getImage()==-1)
            {
                info+="-i";
                System.out.println(info);
                return;
            }

            if (this.getImage()!=0)
            {
                info += this.getImage() + "i";
            }


            System.out.println(info);
        }
}


