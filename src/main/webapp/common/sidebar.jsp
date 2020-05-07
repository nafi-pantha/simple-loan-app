<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="/">
        <div class="sidebar-brand-icon rotate-n-15">
            <i class="fas fa-credit-card"></i>
        </div>
        <div class="sidebar-brand-text mx-3">Loan App</div>
    </a>

    <hr class="sidebar-divider my-0">
    <sec:authorize access="hasAuthority('Admin')">
        <div class="sidebar-heading">Admin</div>

        <!-- Nav Item - Tables -->
        <li class="nav-item">
            <a class="nav-link" href="/loan-approval">
                        <i class="fas fa-fw fa-check"></i>
                        <span>Approve/Reject Loan</span>
                    </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/loan-list">
                        <i class="fas fa-fw fa-list"></i> <span>Loan List</span>
                    </a>
        </li>
    </sec:authorize>

    <hr class="sidebar-divider my-0">
    <sec:authorize access="hasAuthority('Employee')">
        <div class="sidebar-heading">Employee</div>
        <li class="nav-item">
            <a class="nav-link" href="/create-customer">
                        <i class="fas fa-fw fa-user"></i> <span>Create Customer</span>
                    </a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="/loan-apply">
                        <i class="fas fa-fw fa-file"></i> <span>Apply Loan</span>
                    </a>
        </li>
    </sec:authorize>
    <!-- Divider -->
    <hr class="sidebar-divider d-none d-md-block">

    <!-- Sidebar Toggler (Sidebar) -->
    <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
    </div>

</ul>