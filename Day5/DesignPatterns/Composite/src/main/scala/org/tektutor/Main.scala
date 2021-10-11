package org.tektutor

object DemonstrateCompositePattern extends App:

  val emp1 = new Employee("Ashok", "Accounts Executive" )
  val emp2 = new Employee("Kumar", "Accounts Executive" )
  val emp3 = new Employee("Moorthy", "Accounts Head" )

  val accountsDept = new Department ( "Accounts Department" )
  accountsDept.addEmployee ( emp1 )
  accountsDept.addEmployee ( emp2 )
  accountsDept.addEmployee ( emp3 )

  val emp4 = new Employee("Ganesh", "HR Manager" )
  val emp5 = new Employee("Sanjay", "HR Executive" )
  val hrDept = new Department ( "HR Department" )
  hrDept.addEmployee ( emp4 )
  hrDept.addEmployee ( emp5 )

  val tekTutor = new Organization ( "TekTutor" )
  tekTutor.addDepartment ( hrDept )
  tekTutor.addDepartment ( accountsDept )

  tekTutor.print()



