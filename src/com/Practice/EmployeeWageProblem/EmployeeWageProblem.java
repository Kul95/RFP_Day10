package com.Practice.EmployeeWageProblem;

public class EmployeeWageProblem {

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;
        private final String company;
        private final int empRateperHour;
        private final int noOfWorkingDays;
        private final int maxHourPerMonth;
        public EmployeeWageProblem(String company,int empRateperHour,int noOfWorkingDays,int maxHourPerMonth){
            this.company=company;
            this.empRateperHour=empRateperHour;
            this.noOfWorkingDays=noOfWorkingDays;
            this.maxHourPerMonth=maxHourPerMonth;
        }

        public static void main(String[] args) {
            EmployeeWageProblem mintra=new EmployeeWageProblem("Mintra",30,4,40);
            int empHour=0,totalEmpHour=0,totalWorkingDays=0;
            while(totalEmpHour<=mintra.maxHourPerMonth && totalWorkingDays<mintra.noOfWorkingDays){
                totalWorkingDays++;
                int empCheck=(int)Math.floor(Math.random()*10)%3;
                switch (empCheck){
                    case IS_PART_TIME: empHour=4;break;
                    case IS_FULL_TIME: empHour=8;break;
                    default:empHour=0;
                }
                totalEmpHour=totalEmpHour+empHour;
                System.out.println("Days:"+totalWorkingDays+" Emp Hour "+empHour);
            }
            int totalEmployeeWage=totalEmpHour*mintra.empRateperHour;
            System.out.println("Total employee wage for company: "+mintra.company+" is :"+totalEmployeeWage);
        }

    }

