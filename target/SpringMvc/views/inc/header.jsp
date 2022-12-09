<%--
  Created by IntelliJ IDEA.
  User: laghr
  Date: 12/5/2022
  Time: 11:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body>
<header class="bg-indigo-600">
  <nav class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8" aria-label="Top">
    <div class="w-full py-6 flex items-center justify-between border-b border-indigo-500 lg:border-none">
      <div class="flex items-center">
        <a href="#">
          <span class="sr-only">Workflow</span>
          <img class="h-10 w-auto" src="https://www.marjane.ma/icons/logo_marjane_market.svg" alt="">
        </a>
        <div class="hidden ml-10 space-x-8 lg:block">
          <a href="#" class="text-base font-medium text-white hover:text-indigo-50"> Solutions </a>

          <a href="#" class="text-base font-medium text-white hover:text-indigo-50"> Pricing </a>

          <a href="#" class="text-base font-medium text-white hover:text-indigo-50"> Docs </a>

          <a href="#" class="text-base font-medium text-white hover:text-indigo-50"> Company </a>
        </div>
      </div>
      <div class="ml-10 space-x-4">
        <a href="#" class="inline-block bg-indigo-500 py-2 px-4 border border-transparent rounded-md text-base font-medium text-white hover:bg-opacity-75">Sign in</a>
        <a href="#" class="inline-block bg-white py-2 px-4 border border-transparent rounded-md text-base font-medium text-indigo-600 hover:bg-indigo-50">Sign up</a>
      </div>
    </div>
    <div class="py-4 flex flex-wrap justify-center space-x-6 lg:hidden">
      <a href="#" class="text-base font-medium text-white hover:text-indigo-50"> Solutions </a>

      <a href="#" class="text-base font-medium text-white hover:text-indigo-50"> Pricing </a>

      <a href="#" class="text-base font-medium text-white hover:text-indigo-50"> Docs </a>

      <a href="#" class="text-base font-medium text-white hover:text-indigo-50"> Company </a>
    </div>
  </nav>
</header>