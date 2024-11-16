<%@ taglib uri="demo.app.tags" prefix="c" %>
    <html>

    <head>
        <title>EmDepartment</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>

    <body>
        <!-- <h1>
            Here's the message for you :
            <c:putMessage />
        </h1> -->

        <div class="container">
            <div style="text-align: center;margin-top: 35px;margin-bottom: 40;">
                <h1>Employee Department System</h1>
            </div>
            <div class="row">
                <div class="col-xl-6">
                    <h2>Employees</h2>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Name</th>
                                <th scope="col">Job</th>
                                <th scope="col">HireDate</th>
                                <th scope="col">Salary</th>
                                <th scope="col">Department</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:GetEmployees employees="entry">
                                <tr scope="row">
                                    <td>${entry.empId}</td>
                                    <td>${entry.ename}</td>
                                    <td>${entry.job}</td>
                                    <td>${entry.hireDate}</td>
                                    <td>${entry.sal}</td>
                                    <td>${entry.deptNo}</td>
                                </tr>
                            </c:GetEmployees>
                        </tbody>
                    </table>
                </div>
                <div class="col-xl-6">
                    <h2>Departments</h2>
                    <table class="table table-striped">
                        <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Name</th>
                                <th scope="col">Location</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:GetDepartments departments="entry">
                                <tr scope="row">
                                    <td>${entry.deptNo}</td>
                                    <td>${entry.dname}</td>
                                    <td>${entry.location}</td>
                                </tr>
                            </c:GetDepartments>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

    </body>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
        crossorigin="anonymous"></script>

    </html>