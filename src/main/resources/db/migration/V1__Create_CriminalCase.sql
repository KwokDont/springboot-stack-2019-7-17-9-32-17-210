create table `CriminalCase`(
    `id` int not null auto_increment primary key,
    `case_name` varchar(255) not null,
    `incident_time` timestamp not null,
    `case_element_id` varchar(255),
    `procuratorate_id` varchar(255)
)