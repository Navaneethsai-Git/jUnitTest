package jUnitTest1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ addStrings1.class, testAddNumbers1.class })
public class AllTests {

}
