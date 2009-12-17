require 'benchmark'

class Integer
  def even?
    self % 2 == 0
  end

  def prime?
    return false if self < 3 or self.even?
    terms = (3..Math.sqrt(self)).reject(&:even?)
    !terms.any? do |term|
      self % term == 0
    end
  end
end

if __FILE__ == $0
  Benchmark.bm(10) do |reporter|
    (4..6).each do |power|
      bound = 10**power
      reporter.report("%9d:" % bound) { (1..bound).each { |x| x.prime? } }
    end
  end
end