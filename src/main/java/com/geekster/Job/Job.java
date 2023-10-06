        package com.geekster.Job;

        import lombok.AllArgsConstructor;
        import lombok.NoArgsConstructor;

        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @Entity
        public class Job {
            private Long id;
            private String title;
            private String description;
            private String location;
            private Double salary;
        //    (hint @min for salary : should be above 20,000 )
            private String companyEmail;

            private String companyName;
            private String employerName;
            private Type jobType;
        }
