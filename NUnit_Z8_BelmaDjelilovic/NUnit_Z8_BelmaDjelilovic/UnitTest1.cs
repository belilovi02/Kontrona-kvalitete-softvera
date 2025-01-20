using Microsoft.VisualStudio.TestTools.UnitTesting;
using NUnit.Framework;
using System;

using Assert = NUnit.Framework.Assert;
using IgnoreAttribute = NUnit.Framework.IgnoreAttribute;

namespace NUnitTest
{
   
public class Tests
{
    private string courseName;

    [SetUp]
    public void Setup()
    {
        courseName = GetCourseName();
    }

    [Test]
    public void CourseNameContainsInzenjerstvo()
    {
        Assert.That(courseName, Contains.Substring("inženjerstvo"));
    }

    [Test]
    public void CourseNameEndsWithCiklus()
    {
        Assert.That(courseName, Does.EndWith("ciklus"));
    }

    [Test]
    public void CourseNameStartsWithSoftversko()
    {
        Assert.That(courseName, Does.StartWith("Softvrsko"));
    }

    [Test]
    public void CourseNameMatchesExpected()
    {
        Assert.That(courseName, Is.EqualTo("Softversko inženjerstvo - 1. ciklus"));
    }

    [Test]
    public void CourseNameDoesNotMatchOther()
    {
        Assert.That(courseName, Is.Not.EqualTo("Proizvodni biznis"));
    }
}

}