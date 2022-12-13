<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html class="h-full bg-white">
    <head>
        <title>Admin - agent management</title>
        <script src="https://cdn.tailwindcss.com"></script>
    </head>
    <body class="h-full " >
    <div>

        <!-- Section: Design Block -->
        <section class="mb-40 ">
            <nav class="navbar navbar-expand-lg shadow-md py-2 bg-white relative flex items-center w-full justify-between">
                <div class="px-6 w-full flex flex-wrap items-center justify-between">
                    <div class="flex items-center">
                        <button
                                class="navbar-toggler border-0 py-3 lg:hidden leading-none text-xl bg-transparent text-gray-600 hover:text-gray-700 focus:text-gray-700 transition-shadow duration-150 ease-in-out mr-2"
                                type="button"
                                data-bs-toggle="collapse"
                                data-bs-target="#navbarSupportedContentY"
                                aria-controls="navbarSupportedContentY"
                                aria-expanded="false"
                                aria-label="Toggle navigation"
                        >

                                <path
                                        fill="currentColor"
                                        d="M16 132h416c8.837 0 16-7.163 16-16V76c0-8.837-7.163-16-16-16H16C7.163 60 0 67.163 0 76v40c0 8.837 7.163 16 16 16zm0 160h416c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16H16c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16zm0 160h416c8.837 0 16-7.163 16-16v-40c0-8.837-7.163-16-16-16H16c-8.837 0-16 7.163-16 16v40c0 8.837 7.163 16 16 16z"
                                ></path>
                            </svg>
                        </button>
                        <a class="navbar-brand text-blue-600" href="#!">
                            <img class="w-16" src="https://imgs.search.brave.com/HtbJt6kxB1qcEzxTPBikAh7Y05ioSmMpGMvnMElbtJk/rs:fit:748:512:1/g:ce/aHR0cHM6Ly9yYWRp/b3RldG91YW4ubWEv/d3AtY29udGVudC91/cGxvYWRzLzIwMTkv/MDcvY25zcy5sb2dv/Xy5qcGc" alt="" />
                        </a>
                    </div>
                    <div class="navbar-collapse collapse grow items-center" id="navbarSupportedContentY">
                        <ul class="navbar-nav mr-auto lg:flex lg:flex-row">
                            <li class="nav-item">
                                <a class="nav-link block pr-2 lg:px-2 py-2 text-gray-600 hover:text-gray-700 focus:text-gray-700 transition duration-150 ease-in-out" href="#!" data-mdb-ripple="true" data-mdb-ripple-color="light">Dashboard</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link block pr-2 lg:px-2 py-2 text-gray-600 hover:text-gray-700 focus:text-gray-700 transition duration-150 ease-in-out" href="#!" data-mdb-ripple="true" data-mdb-ripple-color="light">Team</a>
                            </li>
                            <li class="nav-item mb-2 lg:mb-0">
                                <a class="nav-link block pr-2 lg:px-2 py-2 text-gray-600 hover:text-gray-700 focus:text-gray-700 transition duration-150 ease-in-out" href="#!" data-mdb-ripple="true" data-mdb-ripple-color="light">Projects</a>
                            </li>
                        </ul>
                    </div>
                    <div class="flex items-center lg:ml-auto">
                        <a href="/login" class="inline-block px-6 py-2.5 mr-2 bg-transparent text-blue-600 font-medium text-xs leading-tight uppercase rounded hover:text-blue-700 hover:bg-gray-100 focus:bg-gray-100 focus:outline-none focus:ring-0 active:bg-gray-200 transition duration-150 ease-in-out" data-mdb-ripple="true" data-mdb-ripple-color="light">Login</a>
<%--                        <button type="button" class="inline-block px-6 py-2.5 bg-blue-600 text-white font-medium text-xs leading-tight uppercase rounded shadow-md hover:bg-blue-700 hover:shadow-lg focus:bg-blue-700 focus:shadow-lg focus:outline-none focus:ring-0 active:bg-blue-800 active:shadow-lg transition duration-150 ease-in-out" data-mdb-ripple="true" data-mdb-ripple-color="light">Sign up for free</button>--%>
                    </div>
                </div>
            </nav>

            <div class="text-center bg-gray-50 text-gray-800 py-24 px-6">
                <h1 class="text-5xl md:text-6xl xl:text-7xl font-bold tracking-tight mb-12">The Best Appplication to Manage<br />
                    <span class="text-blue-600">Your Css</span></h1>
                <a class="inline-block px-7 py-3 mr-2 bg-blue-600 text-white font-medium text-sm leading-snug uppercase rounded shadow-md hover:bg-blue-700 hover:shadow-lg focus:bg-blue-700 focus:shadow-lg focus:outline-none focus:ring-0 active:bg-blue-800 active:shadow-lg transition duration-150 ease-in-out" data-mdb-ripple="true" data-mdb-ripple-color="light" href="/login" role="button">Go For Login Form Now</a>
<%--                <a class="inline-block px-7 py-3 bg-transparent text-blue-600 font-medium text-sm leading-snug uppercase rounded hover:text-blue-700 hover:bg-gray-100 focus:bg-gray-100 focus:outline-none focus:ring-0 active:bg-gray-200 transition duration-150 ease-in-out" data-mdb-ripple="true" data-mdb-ripple-color="light" href="#!" role="button">Learn more</a>--%>
            </div>
        </section>
        <!-- Section: Design Block -->

    </div>
    </body>
</html>